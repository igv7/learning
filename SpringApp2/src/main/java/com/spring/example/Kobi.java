package com.spring.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Kobi implements Teacher {

	

	public void Teach() {
		System.out.println("Kobi Java");
		
	}

}
