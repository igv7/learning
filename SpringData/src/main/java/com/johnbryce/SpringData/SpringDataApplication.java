package com.johnbryce.SpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.johnbryce.SpringData.full.rest.UserController;
import com.johnbryce.SpringData.full.service.UserService;

@SpringBootApplication(scanBasePackages="com.johnbryce.SpringData")
@EnableJpaRepositories
public class SpringDataApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDataApplication.class, args);
		System.out.println("Go!");
		
		System.out.println("**************************UserController Test****************************");
		UserController userController = ctx.getBean(UserController.class);
		System.out.println(userController.getAllUsers());
		
		
		
		
		
		System.out.println("**************************UserService Test****************************");
		UserService userService = ctx.getBean(UserService.class);
		System.out.println(userService.getUsers());
	}

}
