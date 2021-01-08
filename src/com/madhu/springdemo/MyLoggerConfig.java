/**
 * 
 */
package com.madhu.springdemo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Madhukar
 *
 */
@Configuration
@PropertySource("mylogger.properties")
public class MyLoggerConfig {
	
	@Value("${root.logger.level}")
	private String rootLoggerLevel;
	
	@Value("${printed.logger.level}")
	private String printedLoggerLevel;
	
	/**
	 * @param rootLoggerLevel the rootLoggerLevel to set
	 */
	public void setRootLoggerLevel(String rootLoggerLevel) {
		this.rootLoggerLevel = rootLoggerLevel;
	}

	/**
	 * @param printedLoggerLevel the printedLoggerLevel to set
	 */
	public void setPrintedLoggerLevel(String printedLoggerLevel) {
		this.printedLoggerLevel = printedLoggerLevel;
	}
	
	@PostConstruct
	public void initLogger() {
		Level rootLevel = Level.parse(rootLoggerLevel);
		Level printedLevel = Level.parse(printedLoggerLevel);
		
		// get logger for app context
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
		
		// get logger parent
		Logger loggerParent = applicationContextLogger.getParent();
		
		// set root logging level
		loggerParent.setLevel(rootLevel);
		
		// setup console handler
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(printedLevel);
		consoleHandler.setFormatter(new SimpleFormatter());
		
		// add handler to the log
		loggerParent.addHandler(consoleHandler);
	}
	
}
