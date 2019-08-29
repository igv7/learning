package com.johnbryce.beans;

//import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class SingletoneBean {

	private int num = (int) (Math.random() * 100);
	private int evenNum = 0;
	private boolean b = true;

	public SingletoneBean() {
		System.out.println("CTOR SingletoneBean in action");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getEvenNum() {
		return evenNum;
	}

	public void setEvenNum(int evenNum) {
		this.evenNum = evenNum;
	}
	
//	@PostConstruct//
	public int singleEvenNum() {
		while (b == true) {
			if (num % 2 == 0) {
				evenNum = evenNum + num;
//				System.out.println("singletoneBean Even Number" + evenNum);//
			} else {
				evenNum = evenNum + num + 1;
//				System.out.println("singletoneBean Even Number" + evenNum);//
			}
			b = false;
		}
		return evenNum;
	}

}
