package com.johnbryce;

import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {
	
	@Value("17")
	private String id;
	
	@Value("Moshe")
	private String name;
	
	@Autowired
	private OtherClass otherClass;
	
	public SomeClass() {
		System.out.println("CTOR in action");
	}
	
	@Loggable /// <<<<<<<<<<<<<<<<<<<<<<<<<<<--------------------------------------- WOW!
	public OtherClass getOtherClass() {
		return otherClass;
	}

	public void setOtherClass(OtherClass otherClass) {
		this.otherClass = otherClass;
	}

	@Loggable
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Kokoriko
	public String getName() {
		return name;
	}
	
//	@AfterThrowing
	public void setName(String name) {
		this.name = name;
	}
	

}
