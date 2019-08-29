package com.johnbryce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.johnbryce.config.Configuration;
import com.johnbryce.repo.DAO;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		
		
		DAO db = context.getBean(DAO.class);
		System.out.println(db.count());
				

	}

}