package com.GreetingApp.GreetingApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {
		final Logger logger= LoggerFactory.getLogger(GreetingAppApplication.class);
		System.out.println("Welcome to Greeting App");
		logger.debug("Welcome to Greeting");
		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
