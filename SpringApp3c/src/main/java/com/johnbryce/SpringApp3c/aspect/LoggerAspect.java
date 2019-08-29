package com.johnbryce.SpringApp3c.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

	@Before("@annotation(com.johnbryce.SpringApp3c.aspect.Logger)")
	public void someAdvice() {
		System.out.println("Some advice....");
	}
	
	// not in use
	@Pointcut("execution=(public int getNum())")
	public void myPointCut() {};
	
}
