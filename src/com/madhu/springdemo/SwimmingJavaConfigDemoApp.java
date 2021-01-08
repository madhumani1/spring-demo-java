/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Madhukar
 *
 */
public class SwimmingJavaConfigDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the spring configuration file
		// retrieve bean from spring container
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		SwimmingCoach theCoach = context.getBean("swimmingCoach",SwimmingCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		
		// close the context
		context.close();
	}

}
