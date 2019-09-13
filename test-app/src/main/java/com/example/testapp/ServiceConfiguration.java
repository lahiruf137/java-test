package com.example.testapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.*;

@Configuration
public class ServiceConfiguration {
	
	@Bean
	public String getMessage() {
		double i=Math.random()*10;
		System.out.println("Init bean"+i);
		return new String("Test 001"+i);
		
		
	}

}
