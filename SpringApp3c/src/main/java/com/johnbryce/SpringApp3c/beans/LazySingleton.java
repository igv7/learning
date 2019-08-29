package com.johnbryce.SpringApp3c.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Lazy
@NoArgsConstructor
@Data// add to test something..
public class LazySingleton {
	
	@PostConstruct
	public void init() {
		System.out.println("Post Construct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Pre Destroy");
	}
	
	private int num = (int) (Math.random()*100);// add to test something..

//@Component
//@Lazy
//public class LazySingleton {
//
//	public LazySingleton() {
//		System.out.println("LazySingleton CTOR in action");
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("Post Construct");
//	}
//	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Pre Destroy");
//	}
	

}
