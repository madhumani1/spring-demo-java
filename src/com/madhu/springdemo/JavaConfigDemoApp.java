/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Madhukar
 *
 */
public class JavaConfigDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the spring Java configuration file
		// retrieve bean from spring container
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		//Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// check if they are the same
		/*
		 * boolean result = (theCoach == alphaCoach);
		 * 
		 * System.out.println("\nPointing to the same object: "+result);
		 * System.out.println("Memory location for theCoach: "+theCoach);
		 * System.out.println("Memory location for theCoach: "+alphaCoach);
		 */
		
		// close the context
		context.close();
	}

}
