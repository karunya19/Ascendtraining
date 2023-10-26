package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.sample.entity.SampleEntity;
import com.example.sample.service.SampleService;

@RestController
@RequestMapping("/demo")

public class SampleController {

	@Autowired
	SampleService sampservice;
	
	@PostMapping("/create")
	public ResponseEntity<String> createSample(@RequestBody SampleEntity samp) {
		
		sampservice.createSample(samp);
	
		return ResponseEntity.ok("inserted");
	}
}
