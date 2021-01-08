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
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune is for those master REST!";
	}
}
