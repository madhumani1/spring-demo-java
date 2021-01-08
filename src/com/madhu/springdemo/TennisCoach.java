package com.madhu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * POJO
 * @author Madhukar
 *
 */
// Add the @Component Annotation to your Java classes
//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	//private String email;
	
	// Constructor
	/*
	 * @Autowired
	 * public TennisCoach(FortuneService fortuneService) {
	 * 		this.fortuneService = fortuneService; 
	 * }
	 */ 
	 // create a no-arg constructor 
	 public TennisCoach() {
	 		System.out.println("TennisCoach: inside no-arg constructor"); 
	 }
	 
	/**
	 * @return the fortuneService
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/**
	 * our setter method will be called by Spring when they inject dependency
	 * @param fortuneService the fortuneService to set
	 */
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside setter methor - setFortuneService");
		this.fortuneService = fortuneService;
	}*/
	
	/**
	 * Autowired will be used by Spring
	 * @param fortuneService
	 */
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService)	{
		System.out.println("doSomeCrazyStuff: method injection");
		this.fortuneService=fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Do a backhand volley for 15 mins";
	}
	
	@Override
	public String getDailyFortune() {
		// use my fortuneSerivce to get a fortune 
		return fortuneService.getFortune();
	}
}
