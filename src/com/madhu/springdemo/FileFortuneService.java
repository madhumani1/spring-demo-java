/**
 * 
 */
package com.madhu.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.springframework.stereotype.Component;

/**
 * @author Madhukar
 * Challenge for Dependency Injection with Annotations
 * Define a new implementation for the FortuneService
 * 	- Read from File, load into array and return a random forutne from array
 *
 */
@Component
public class FileFortuneService implements FortuneService {

	//private String[] fortunes;
	private List<String> fortunes;
	
	// create a default constructor
	private void init() {
		try {
			FileReader fr = new FileReader("src/FortuneFile.txt");
			BufferedReader in = new BufferedReader(fr);
			String str;
			fortunes = new ArrayList<String>();
			while((str = in.readLine()) != null){
				if(!str.trim().equals("")) {
					fortunes.add(str);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		init();
		return (fortunes==null)?null:fortunes.get((new Random()).nextInt(fortunes.size()));
	}

}
