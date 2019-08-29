package com.johnbryce.SpringApp3c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.johnbryce.SpringApp3c.beans.ComposedBean;
import com.johnbryce.SpringApp3c.beans.LazySingleton;
import com.johnbryce.SpringApp3c.beans.PrototypeBean;
import com.johnbryce.SpringApp3c.beans.SingletonBean;


@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringApp3cApplication {

	public static void main(String[] args) {

//		ApplicationContext context = SpringApplication.run(SpringApp3cApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(SpringApp3cApplication.class, args);
		System.out.println("Bean Loaded");
		
		System.out.println("*****************************PrototypeBean**************************************");
		PrototypeBean prototypeBeanA = context.getBean("prototypeBean", PrototypeBean.class);
		System.out.println("PrototypeBeanA " + prototypeBeanA.getNum());
		
		PrototypeBean prototypeBeanB = context.getBean("prototypeBean", PrototypeBean.class);
		System.out.println("PrototypeBeanB " + prototypeBeanB.getNum());
		
		
		System.out.println("*****************************SingletonBean**************************************");
		SingletonBean singletonBeanA = context.getBean("singletonBean", SingletonBean.class);
		System.out.println("SingletonBeanA " + singletonBeanA.getNum());
		
		SingletonBean singletonBeanB = context.getBean("singletonBean", SingletonBean.class);
		System.out.println("SingletonBeanB " + singletonBeanB.getNum());
		
		
		System.out.println("*****************************protoSix**************************************");
		PrototypeBean protoSixA = context.getBean("protoSix", PrototypeBean.class);
		System.out.println("protoSix" + protoSixA.getNum());
		
		PrototypeBean protoSixB = context.getBean("protoSix", PrototypeBean.class);
		System.out.println("protoSix" + protoSixB.getNum());
		
		
		System.out.println("*****************************ComposedBean**************************************");
		ComposedBean composedBean = context.getBean(ComposedBean.class);
		System.out.println("MyPrototypeBean " + composedBean.getMyPrototypeBean().getNum());
		System.out.println("MySingletonBean " + composedBean.getMySingletonBean().getNum());
		System.out.println("MyProtoSix " + composedBean.getMyProtoSix().getNum());
//		System.out.println("MySingletonBean " + composedBean.getMySingletonBean().getNum());
		
		
		System.out.println("*****************************LazySingleton**************************************");// add to test something..
		LazySingleton lazySingletonA = context.getBean("lazySingleton", LazySingleton.class); //new LazySingleton();// remove "A" from lazySingletonA
		System.out.println("LazySingletonA " + lazySingletonA.getNum());// add to test something..
		
		LazySingleton lazySingletonB = context.getBean("lazySingleton", LazySingleton.class); //new LazySingleton();// add to test something..
		System.out.println("LazySingletonB " + lazySingletonB.getNum());// add to test something..
		
		context.close();
	}
	
	@Bean
	public PrototypeBean protoSix() {
		
		PrototypeBean protoSix = new PrototypeBean();
		protoSix.setNum(6);
		return protoSix;
	
	}
	

}
