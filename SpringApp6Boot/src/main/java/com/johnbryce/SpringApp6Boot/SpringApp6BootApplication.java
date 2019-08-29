package com.johnbryce.SpringApp6Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApp6BootApplication {
	
	@RequestMapping("/")
	public String greet() {
		return "Hello there";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApp6BootApplication.class, args);
	}

}
