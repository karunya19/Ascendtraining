package com.example.Factapi.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.Factapi.module.Fact;
import com.example.Factapi.module.User;
import com.example.Factapi.service.FactService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class FactControllerTest {
	
	@Mock
	FactService factService;

	@InjectMocks
	FactController controller;

	@Test
	void test() {
		User user = new User();
		user.setName("Karunya");
		user.setCount(2);
		
		Fact fact = new Fact();
		fact.setFact("Hello");
		fact.setLength(2);
		
		List<Fact> facts =  new ArrayList<>();
		facts.add(fact);
		ResponseEntity<List<Fact>> responseEntity = new ResponseEntity<>(facts,HttpStatus.OK);
		
		
		
		when(factService.getAPI(user.getCount())).thenReturn(responseEntity);
		ResponseEntity<List<Fact>> entity = controller.saveData(user);
		
		assertEquals(HttpStatus.OK,entity.getStatusCode());
	
	}

}
