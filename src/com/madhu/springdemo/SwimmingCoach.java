/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Madhukar
 *
 */
public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	/*public void setEmail(String email) {
		this.email = email;
	}*/

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	/*public void setTeam(String team) {
		this.team = team;
	}*/

	// constructor
	public SwimmingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do a butterfly stoke for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
