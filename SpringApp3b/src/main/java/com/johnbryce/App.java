package com.johnbryce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.johnbryce.beans.ComposedBean;
import com.johnbryce.beans.PrototypeBean;
import com.johnbryce.beans.SingletoneBean;
import com.johnbryce.config.Config;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("************************PrototypeBean******************************");
		PrototypeBean prototypeBeanA = context.getBean("prototypeBean", PrototypeBean.class);
		System.out.println("prototypeBeanA = " + prototypeBeanA.getNum());
		System.out.println("prototypeBeanA Even Num = " + prototypeBeanA.protoEvenNum());//////////////Even Number
		
		PrototypeBean prototypeBeanB = context.getBean("prototypeBean", PrototypeBean.class);
		System.out.println("prototypeBeanB = " + prototypeBeanB.getNum());
		System.out.println("prototypeBeanB Even Num = " + prototypeBeanB.protoEvenNum());//////////////Even Number
		
		
		
		System.out.println("************************SingletoneBean******************************");
		SingletoneBean singletoneBeanA = context.getBean("singletoneBean", SingletoneBean.class);
		System.out.println("singletoneBeanA = " + singletoneBeanA.getNum());
		System.out.println("singletoneBeanA Even Num = " + singletoneBeanA.singleEvenNum());//////////////Even Number
		
		SingletoneBean singletoneBeanB = context.getBean("singletoneBean", SingletoneBean.class);
		System.out.println("singletoneBeanB = " + singletoneBeanB.getNum());
		System.out.println("singletoneBeanB Even Num = " + singletoneBeanB.singleEvenNum());//////////////Even Number
		
		
		
		System.out.println("************************ComposedBean******************************");
		ComposedBean composedBean = context.getBean("composedBean", ComposedBean.class);
		System.out.println("singletoneBean = " + composedBean.getMySingletoneBean().getNum());
		System.out.println("singletoneBean Even Num = " + composedBean.getMySingletoneBean().singleEvenNum());/////Even Number
		
		System.out.println("prototypeBean = " + composedBean.getMyPrototypeBean().getNum());
		System.out.println("prototypeBean Even Num = " + composedBean.getMyPrototypeBean().protoEvenNum());////////Even Number
		
		System.out.println("protoSix = " + composedBean.getMyProtoSix().getNum());

	}

}
