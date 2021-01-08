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
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day!";
	}
}
