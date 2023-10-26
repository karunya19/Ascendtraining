package com.example.Factapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.example.Factapi.module.Fact;
import com.example.Factapi.module.User;
import com.example.Factapi.service.FactService;

public class FactController {

	@Autowired
	FactService factService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/savedata")
	public ResponseEntity<List<Fact>> saveData(@RequestBody @Valid User user)
	{
		List<User> list = new ArrayList<User>();
		if(user!=null) {
			list.add(user);
			return factService.getAPI(user.getCount());
		}
		return new ResponseEntity<List<Fact>>(HttpStatus.BAD_REQUEST);
	}
	
}
