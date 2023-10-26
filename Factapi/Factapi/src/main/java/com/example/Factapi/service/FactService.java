package com.example.Factapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Factapi.module.Fact;

@Service
public class FactService {

	@Autowired
	RestTemplate restTemplate;
	
	public ResponseEntity<List<Fact>> getAPI(Integer count) {
		List<Fact> facts = new ArrayList<>();
		String url = "https://catfact.ninja/fact";
		for(int i = 0; i < count; i++) {
			facts.add(restTemplate.getForObject(url, Fact.class));
			
		}
		return new ResponseEntity<List<Fact>>(facts, HttpStatus.OK);
	}
}
