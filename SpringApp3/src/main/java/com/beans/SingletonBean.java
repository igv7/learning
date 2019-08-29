package com.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")//Optional
public class SingletonBean {
	
	private int num = (int) (Math.random()*100);
	
	public SingletonBean() {
		System.out.println("SingletonBean CTOR in action");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

}
