package com.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazySingleton {
	
	public LazySingleton() {
		System.out.println("LazySingleton CTOR in action!");
	}

	@PostConstruct
	public void init() {
		System.out.println("Init LazySingleton");
	}

	@PreDestroy
	public void destory() {
		System.out.println("Destroy LazySingleton");
	}
}
