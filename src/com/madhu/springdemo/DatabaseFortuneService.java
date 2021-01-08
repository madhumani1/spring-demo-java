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
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Learn some database for good fortune!";
	}
}
