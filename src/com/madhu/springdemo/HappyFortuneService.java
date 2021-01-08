/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Madhukar
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
