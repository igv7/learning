package com.johnbryce;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
	
	//AOP - Pointcuts & Wildcard expressions

	// 1 - Any getName()
	@Before("execution(public String getName())")
	public void loggingAdvice1() {
		System.out.println("I'm logging before Any getName() is called");
	}

//	// 2 - Only SomeClass' getName()
//	@Before("execution(public String com.johnbryce.SomeClass.getName())")
//	public void loggingAdvice2() {
//		System.out.println("I'm logging before Only SomeClass getName() is called");
//	}
//
//	// 3 - Any Getter that return String
//	@Before("execution(public String get*())")
//	public void loggingAdvice3() {
//		System.out.println("I'm logging before Any Getter that return String get...() is called");
//	}
//
//	// 4 - Any Getter, Any Return type
//	@Before("execution(public * get*())")
//	public void loggingAdvice4() {
//		System.out.println("I'm logging before Any Getter, Any Return type get...() is called");
//	}
//
//	// 5 - Any Getter, Any Return type
//	@Before("execution( * get*())")
//	public void loggingAdvice5() {
//		System.out.println("I'm logging before Any Getter, Any Return type get...() is called");
//	}
//
//	// 6 - Any Getter, Any Return type, Any Argument
//	@Before("execution( * get*(..))")
//	public void loggingAdvice6() {
//		System.out.println("I'm logging before Any Getter, Any Return type, Any Argument get...(..) is called");
//	}
//	
//	
//	//AOP - @pointcut
//	
//	// 7 - All Getters
//		@Pointcut("execution(* get*())")
//		public void allGetters() {
//		}
//
//		@Before("allGetters()")
//		public void loggingAdvice7() {
//			System.out.println("I'm logging before All Getters get...() is called");
//		}
//
//		// 8 - All SomeClass methods
//		@Pointcut("execution(* com.johnbryce.SomeClass.*(..))")
//		public void allSomeClassMethods() {
//		}
//
//		// 9 - All SomeClass methods
//		@Pointcut("within(com.johnbryce.SomeClass)")
//		public void allSomeClassMethods1() {
//		}
//
//		// 10 - All Beans
//		@Pointcut("within(com.johnbryce.*)")
//		public void allBeans() {
//		}
//		
//		// 11 - Combine PointCuts
//		@Before("allGetters() && allSomeClassMethods()")
//		public void loggingAdvice8() {
//			System.out.println("I'm logging before getName() is called");
//		}
//		
//		
//		//AOP - JointPoint
//		
//		@Pointcut("execution(* get*())")
//		public void allGetters1() {
//		}
//
//		@Pointcut("execution(* com.johnbryce.SomeClass.*(..))")
//		public void allSomeClassMethods2() {
//		}
//
//		// 12 - Add JoinPoint
//		@Before("allGetters1() && allSomeClassMethods2()")
//		public void loggingAdvice(JoinPoint joinPoint) {
//			System.out.println("I'm logging before getName() is called");
//			System.out.println(joinPoint.toString());
//			System.out.println(joinPoint.getTarget());
//		}
//
//		// 13 - Get An Object!
//		@Before("allGetters1() && allSomeClassMethods2()")
//		public void loggingAdvice2(JoinPoint joinPoint) {
//			System.out.println("I'm logging before getName() is called");
//			System.out.println(joinPoint.toString());
//			System.out.println(joinPoint.getTarget());
//			SomeClass s1 = (SomeClass)(joinPoint.getTarget());
//			System.out.println(s1.getName());
//		}
//		
//		
//		//AOP - After Advice Type
//		
//		// 14 - Args
//		@Before("args(name)")
//		public void StringArgument(String name) {
//			System.out.println("Name=" + name);
//		}
//
//		@After("args(name)")
//		public void StringArgument2(String name) {
//			System.out.println("Name=" + name);
//		}
//
//		// 15 - returnValue
//		@AfterReturning("args(name)")
//		public void StringArgumentMethods(String name) {
//			System.out.println("Returned value=" + name);
//		}
//
//		// 16 - uummm... an Exception
//		@AfterThrowing
//		public void exceptionAdcvice(String name) {
//			System.out.println("Got Exception for name=" + name);
//		}
//
//		// 17 - returnValue
//		@AfterReturning(pointcut = "args(name)", returning = "name")
//		public void StringArgumentMethods2(String name, String returnString) {
//			System.out.println("Returned value=" + returnString + " " + name);
//		}
//
//		// 18 - uummm... an Exception
//		@AfterThrowing(pointcut = "args(name)", throwing = "ex")
//		public void exceptionAdcvice2(String name, RuntimeException ex) {
//			System.out.println("Got Exception for name=" + name + "Exception info=" + ex);
//		}
//		
//		
//		//AOP - Around
//		
//		// 19 - Around
//
//		@Around("allGetters2()")
//		public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
//
//			Object returnValue = null;
//			try {
//				
//				System.out.println("Before Advice");
//				returnValue = proceedingJoinPoint.proceed();
//				System.out.println("After Advice");
//				
//			} catch (Throwable e) {
//				System.out.println("After Throwing");
//			}
//			System.out.println("After Try/Catch block");
//			return returnValue;
//
//		}
//
//		@Pointcut("execution(* get*())")
//		public void allGetters2() {
//			
//		}
//		
//		
		//AOP - Call you custom annotation
		
		// 20 - Custom Annotation

		@Around("@annotation(com.johnbryce.Loggable) && allGetters3()")
		public Object myAroundAdvice1(ProceedingJoinPoint proceedingJoinPoint) {

			Object returnValue = null;
			try {
				
				System.out.println("Before Advice");
				System.out.println("This is from Loggabe annotation");
				returnValue = proceedingJoinPoint.proceed();
				System.out.println("After Advice");
				
			} catch (Throwable e) {
				System.out.println("After Throwing");
			}
			System.out.println("After Try/Catch block");
			return returnValue;

		}

		@Pointcut("execution(* get*())")
		public void allGetters3() {
			
		}
		
		
		@Before("@annotation(com.johnbryce.Kokoriko)")
		public void kokorikoAdvice() {
			System.out.println("Kokoriko!!!!!!");
		}

}
