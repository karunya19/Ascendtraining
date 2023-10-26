package com.example.practice1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service 
public class PracticeService {

	@Autowired
	RestTemplate restTemplate;
	
	public String takeAPI() {
		return restTemplate.getForObject("https://catfact.ninja/fact", String.class);
	}
}
