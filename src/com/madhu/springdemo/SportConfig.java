/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Madhukar
 *
 */
@Configuration
//@ComponentScan("com.madhu.springdemo")	// comment PropertySource and uncomment this for for JavaConfigDemoApp
@PropertySource("classpath:sport.properties")	// comment ComponentScan and uncomment this for for SwimmingJavaConfigDemoApp
public class SportConfig {
	/**
	 * step-2 define bean for our swim coach and inject dependency
	 * swimmingCoach will be the bean id by the spring container.
	 * Note: no component scan
	 * Define each bean individually in this config class
	 * @return Coach
	**/
	@Bean
	public Coach swimmingCoach() {
		// Creating Instance of SwimmingCoach and return it.
		SwimmingCoach mySwimmingCoach = new SwimmingCoach( fileFortuneService() );
		return mySwimmingCoach;
	}
	
	/**
	 * step-1 define bean for our random  fortuneService
	 * Create new instance of FortuneService
	 * Bean id is randomFortuneService
	 * @return
	 */
	@Bean
	public FortuneService fileFortuneService()	{
		return new FileFortuneService();
	}
}
