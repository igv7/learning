package com.johnbryce.SpringApp7BootMVC2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.johnbryce.SpringApp7BootMVC2.beans.Person;

@RestController
@SpringBootApplication
public class SpringApp7BootMvc2Application {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Igor!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApp7BootMvc2Application.class, args);
		
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(restTemplate.getForObject("http://localhost:8080/greet?name=Igor", String.class));
		
		Person person = new Person();
		person.setName("Moshe");
		person.setAge(33);
		System.out.println(restTemplate.postForObject("http://localhost:8080/handle", person, String.class));
	}
	
	@Bean
	public List<Person> people() {
		return new ArrayList<Person>();
	}

}
