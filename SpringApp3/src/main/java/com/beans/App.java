package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lombok.LombokBeanA;
import com.lombok.LombokBeanB;
import com.lombok.LombokBeanC;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("************************PrototypeBean******************************");
		PrototypeBean prototypeBeanA = context.getBean("prototypeBean", PrototypeBean.class);
		System.out.println(prototypeBeanA.getNum());
		
		PrototypeBean prototypeBeanB = context.getBean("prototypeBean", PrototypeBean.class);
		System.out.println(prototypeBeanB.getNum());
		
		
		
		System.out.println("************************SingletonBean******************************");
		SingletonBean singletonBeanA = context.getBean("singletonBean", SingletonBean.class);
		System.out.println(singletonBeanA.getNum());
		
		SingletonBean singletonBeanB = context.getBean("singletonBean", SingletonBean.class);
		System.out.println(singletonBeanB.getNum());
		
		
		
		System.out.println("************************ComposedBean******************************");
		ComposedBean composedBean = context.getBean("composedBean", ComposedBean.class);
		System.out.println(composedBean.getProtoSix().getNum() + " protoSix");
		System.out.println(composedBean.getPrototypeBean().getNum() + " prototypeBean");
		System.out.println(composedBean.getSingletonBean().getNum() + " singletonBean");
		
		
		
		System.out.println("************************ProtoSix***********************************");
		PrototypeBean protoSix = context.getBean("protoSix", PrototypeBean.class);
		System.out.println(protoSix.getNum() + " protoSix");
		
		
		
		System.out.println("**************How to call a bean************************************");
		PrototypeBean myBean1 = (PrototypeBean) context.getBean("prototypeBean");
		PrototypeBean myBean2 = context.getBean("prototypeBean",PrototypeBean.class);
		PrototypeBean myBean3 = context.getBean(PrototypeBean.class);//Primary
		PrototypeBean myBean4 = context.getBean("protoSix",PrototypeBean.class);//Qualifier
		
		
		
		System.out.println("************************Lombok***************************************");
		System.out.println("************************lombokA***************************************");
		LombokBeanA lombokA=context.getBean(LombokBeanA.class);
		lombokA.setValue(15);
		System.out.println(lombokA.getValue());
		lombokA.setWord("Hello");
		System.out.println(lombokA.getWord());
		lombokA.setFlag(true);
		System.out.println(lombokA.isFlag());
		System.out.println(lombokA);
		
		System.out.println("************************lombokB***************************************");
		LombokBeanB lombokB=context.getBean(LombokBeanB.class);
		lombokB.setValue(17);
		lombokB.setFlag(false);
		lombokB.setWord("Welcome");
		System.out.println(lombokB);
		
		System.out.println("************************lombokC***************************************");
        LombokBeanC lombokC=LombokBeanC.builder().value(100).flag(true).word("value").build();
        System.out.println(lombokC);
		
		
		
		System.out.println("************************LazySingleton *********************************");
		LazySingleton myLazySingleton = context.getBean("lazySingleton",LazySingleton.class);
		context.close();
		//((AnnotationConfigApplicationContext)context).close();
	}

}
