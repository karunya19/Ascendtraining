package demo.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class PracticeController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello world";
	}

}
