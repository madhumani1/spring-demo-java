/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Madhukar
 * 1. define a new Coach implementation using Annotations
 * 2. Reference the new coach implementation in your main application.
 * 3. Test your application to verify you are getting info from your new coach implementation
 *
 */
@Component
public class LudoCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	// Constructor
	/*@Autowired
	public LudoCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	// create a no-arg constructor
	public LudoCoach() {
		System.out.println("LudoCoach: inside no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practise dice rolling 50 times";
	}
	
	@Override
	public String getDailyFortune() {
		// use my fortuneSerivce to get a fortune 
		return fortuneService.getFortune();
	}

}
