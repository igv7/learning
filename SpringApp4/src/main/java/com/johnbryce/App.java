package com.johnbryce;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		MyBeanPostProcessor myBeanPostProcessor = context.getBean(MyBeanPostProcessor.class);
		
		
		SomeClass someClass = context.getBean(SomeClass.class);
		System.out.println(someClass.getId());
		System.out.println(someClass.getName());
		someClass.setName("Tom");
		System.out.println(someClass.getName());
		
		
		OtherClass otherClass = context.getBean(OtherClass.class);
		System.out.println(otherClass.getId());
		System.out.println(otherClass.getName());
		otherClass.setName("Kobi");
		System.out.println(otherClass.getName());
		
		

		((AbstractApplicationContext) context).registerShutdownHook();
		((AbstractApplicationContext) context).close();
	}


}
