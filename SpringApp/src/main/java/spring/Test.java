package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Cat myCat = context.getBean("c1", Cat.class);
		System.out.println(myCat.getName());
		System.out.println(myCat.getWeight());
		myCat.getChip().info();
		
		
		
		Dog myDog =context.getBean("d1", Dog.class);
		System.out.println(myDog.getName());
		System.out.println(myDog.getWeight());
		myDog.getChip().info();
	}

}
