package com.johnbryce.beans;


//import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import com.johnbryce.myAnnotation.EvenNumber;

@Component
@Scope("prototype")
@Primary
public class PrototypeBean {
	
	private int num = (int) (Math.random()*100);
	private int evenNum = 0;

	public PrototypeBean() {
		System.out.println("CTOR PrototypeBean in action");
	}
	
//	@EvenNumber
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
	public int protoEvenNum() {
		if (num % 2 == 0) {
			evenNum = evenNum + num;
//			System.out.println("prototypeBean Even Number" + evenNum);//
		} else {
			evenNum = evenNum + num + 1;
//			System.out.println("prototypeBean Even Number" + evenNum);//
		}
		return evenNum;
		
	}

}
