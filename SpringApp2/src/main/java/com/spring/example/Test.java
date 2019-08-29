package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student s1 = context.getBean("student", Student.class);
		System.out.println(s1.getName());
		System.out.println(s1.getId());

		s1.getTeacher().Teach();
	}

}
