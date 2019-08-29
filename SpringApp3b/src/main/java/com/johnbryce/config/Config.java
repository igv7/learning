package com.johnbryce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.johnbryce.beans.PrototypeBean;

@Configuration
@ComponentScan(basePackages="com.johnbryce")
public class Config {
	
	@Bean
	public PrototypeBean protoSix() {
		
		PrototypeBean protoSix = new PrototypeBean();
		protoSix.setNum(6);
		return protoSix;
	
	}
	

}
