package person;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) {
		// Getting the class Object for Person
		// Everything in Java has a Class Object

		Class reflectClass = Person.class;
		// Get the class name of an Object
		String className = reflectClass.getName();
		System.out.println(className);

		// Check modifiers of a class
		// isAbstract, isFinal, isInterface, isPrivate, isProtected,
		// isStatic, isStrict, isSynchronized, isVolatile
		int classModifiers = reflectClass.getModifiers();
		System.out.println(Modifier.isPublic(classModifiers));
		
		 // You can get a list of interfaces used by a class
		  Class[] interfaces = reflectClass.getInterfaces();
		  for(Class c: interfaces) {
			  System.out.print(c+" ");
		  }
		  System.out.println();
		  
		  // Get the super class for Person
		  Class classSuper = reflectClass.getSuperclass();
		  System.out.println(classSuper.getName() + "\n");
		// Get the objects methods, return type and parameter type
		          Method[] classMethods = reflectClass.getMethods();

	        for(Method method : classMethods){

	        	            // Get the method name

	        	            System.out.println("Method Name: " + method.getName());

	        	            // Check if a method is a getter or setter
	    
	        	            if(method.getName().startsWith("get")) {
	    
	        	                System.out.println("Getter Method");
	      
	        	            } else if(method.getName().startsWith("set")) {

	        	                System.out.println("Setter Method");

	        	            }

	        	            // Get the methods return type

	        	            System.out.println("Return Type: " + method.getReturnType());

	        	            Class[] parameterType = method.getParameterTypes();

	        	            // List parameters for a method

	        	            System.out.println("Parameters");

	        	            for(Class parameter : parameterType){

	        	                System.out.println(parameter.getName());

	        	            }

	        	            System.out.println();

	        	        }
	        System.out.println("test");

	}

}