package com.example.practice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.practice1.service.PracticeService;

@RestController 
public class PracticeController {

 
 @Autowired
 public PracticeService pracService;
 
 @GetMapping("/get")
 public ResponseEntity<String> getData()
 {
	 try {
		 return new ResponseEntity<>(pracService.takeAPI(),HttpStatus.OK); 
	 }
	 catch (Exception e) {
		 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	 }
 }
 
 
}    
