package com.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class PrototypeBean {
	
	private int num = (int) (Math.random()*100);
	
	public PrototypeBean() {
		System.out.println("PrototypeBean CTOR in action");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

}
