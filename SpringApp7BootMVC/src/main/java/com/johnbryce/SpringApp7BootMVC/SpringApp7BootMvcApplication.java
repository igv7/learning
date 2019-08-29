package com.johnbryce.SpringApp7BootMVC;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.johnbryce.SpringApp7BootMVC.beans.Person;

@SpringBootApplication(scanBasePackages="com.johnbryce.SpringApp7BootMVC")
@RestController
public class SpringApp7BootMvcApplication {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello There!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApp7BootMvcApplication.class, args);
		
		//Testing
		RestTemplate client=new RestTemplate();
		System.out.println(client.getForObject("http://localhost:8080/greet?name=Kobi", String.class));
	}
	
	@Bean
	public Collection<Person> people() {
		return new ArrayList<Person>();
	}

}
