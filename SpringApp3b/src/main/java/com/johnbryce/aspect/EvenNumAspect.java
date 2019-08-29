//package com.johnbryce.aspect;
//
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.johnbryce.beans.*;
//
//@Component
//@Aspect
//public class EvenNumAspect {
//	
//	@Autowired
//	private PrototypeBean pBean;
//	public int evenNum = 0;
//	
//	//@After("getNumPrototypeBean")
//	@After("@annotation(com.johnbryce.myAnnotation.EvenNumber)")
//	public int protoEvenNumAdvice() {
//		if (pBean.getNum()% 2 == 0) {
//			evenNum = evenNum + pBean.getNum();
//			System.out.println("prototypeBean Even Number = " + evenNum);//
//		} else {
//			evenNum = evenNum + pBean.getNum() + 1;
//			System.out.println("prototypeBean Even Number = " + evenNum);//
//		}
//		return evenNum;
//	}
//	
////	@Pointcut("execution(com.johnbryce.beans.PrototypeBean.getNum())")
////	public void getNumPrototypeBean() {
////		
////	}
//
//}
