package com.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.beans", "com.lombok"})
public class Config {
	
	@Bean
	public PrototypeBean protoSix() {
		
		PrototypeBean protoSix = new PrototypeBean();
		protoSix.setNum(6);
		return protoSix;
	
	}

}
