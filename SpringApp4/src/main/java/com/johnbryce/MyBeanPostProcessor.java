package com.johnbryce;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("CTOR in action");
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.postProcess*Before*Initialization() - beanName:[" + beanName + "],beanClass:["
				+ bean.getClass().getName()+"]");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.postProcess*After*Initialization() - beanName:[" + beanName + "],beanClass:["
				+ bean.getClass().getName()+"]");
		return bean;
	}
}
