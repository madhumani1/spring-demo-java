/**
 * 
 */
package com.madhu.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * Challenge for Dependency Injection with XML config
 * Define a new implementation for the FortuneService
 * 	- When getFortune is called, it should return a random fortune from the array.
 * 	- Your fortune service should define 3 fortunes in an array
 * Inject your new dependency into your coach implementation
 * Test your application to verify you are retrieving random fortunes 
 * @author Madhukar
 *
 */
@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Test1","Test2","Test3","Test4","Test5","Test6"};
	@Override
	public String getFortune() {
		return fortunes[(new Random()).nextInt(6)];
	}

}
