package com.johnbryce.SpringApp3c.beans;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class SingletonBean {
	
	private int num = (int) (Math.random()*100);

	
//@Component
//public class SingletonBean {
//	
//	private int num = (int) (Math.random()*100);
//
//	public SingletonBean() {
//		System.out.println("SingletonBean CTOR in action");
//	}
//
//	public int getNum() {
//		return num;
//	}
//
//	public void setNum(int num) {
//		this.num = num;
//	}
	
	
}
