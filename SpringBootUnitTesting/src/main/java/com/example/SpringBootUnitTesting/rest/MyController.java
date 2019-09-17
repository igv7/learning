package com.example.SpringBootUnitTesting.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myController")
public class MyController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello World!";
	}

}