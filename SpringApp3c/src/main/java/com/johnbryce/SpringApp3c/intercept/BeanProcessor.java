package com.johnbryce.SpringApp3c.intercept;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.johnbryce.SpringApp3c.beans.PrototypeBean;


//Bean Interception
@Component
public class BeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
//		System.out.println("postProcessBeforeInitialization " + bean.getClass().getSimpleName());
//		if (bean instanceof PrototypeBean) {
//			if (((PrototypeBean) bean).getNum()%2!=0) {
//				System.out.println("Need to replace: " + ((PrototypeBean) bean).getNum());
//				System.out.println("postProcessBeforeInitialization - Replace the number");
//				while (((PrototypeBean) bean).getNum()%2!=0) {
//					((PrototypeBean) bean).setNum((int) (Math.random()*100));
//				}
//				System.out.println("New Value: " + ((PrototypeBean) bean).getNum());
//			}
//		}
//		return bean;
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("postProcessAfterInitialization " + bean.getClass().getSimpleName());
		if (bean instanceof PrototypeBean) {
			if (((PrototypeBean) bean).getNum()%2!=0) {
				System.out.println("Need to replace: " + ((PrototypeBean) bean).getNum());
				System.out.println("postProcessAfterInitialization - Replace the number");
				while (((PrototypeBean) bean).getNum()%2!=0) {
					((PrototypeBean) bean).setNum((int) (Math.random()*100));
				}
				System.out.println("New Value: " + ((PrototypeBean) bean).getNum());
			}
		}
		return bean;
//		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
