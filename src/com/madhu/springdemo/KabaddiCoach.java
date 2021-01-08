/**
 * 
 */
package com.madhu.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @author Madhukar
 * Bean lifecycle
 * Note: From Java 9 onwards, @PostConstruct and @PreDestroy are not recognized
 * because java.annotation has been removed from default class.
 * Get it from Maven: https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2
 */
@Component
@Scope("prototype")
public class KabaddiCoach implements Coach, DisposableBean {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	/**
	 * @return the fortuneService
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	@PostConstruct
	public void doMyStartupStuff()	{
		System.out.println("KabaddiCoach: inside method doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff()	{
		System.out.println("KabaddiCoach: inside method doMyCleanupStuff");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do a dhar pakad training for 45 mins";
	}
	
	@Override
	public String getDailyFortune() {
		// use my fortuneSerivce to get a fortune 
		return fortuneService.getFortune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("KabaddiCoach: inside method destroy()");
	}

}
