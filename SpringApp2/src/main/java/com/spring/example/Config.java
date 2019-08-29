package com.spring.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.spring.example")
@PropertySource("classpath:student-info.properties")
public class Config {

}
