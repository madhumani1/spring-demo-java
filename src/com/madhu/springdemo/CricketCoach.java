/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Madhukar
 * Bean scope
 */
@Component
@Scope("prototype")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
