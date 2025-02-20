package com.academy.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class FinalApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(FinalApplication.class, args);*/
		
		ConfigurableApplicationContext context = SpringApplication.run(FinalApplication.class, args);
	    ConfigurableEnvironment env = context.getEnvironment();
	    System.out.println("MongoDB Database: " + env.getProperty("spring.data.mongodb.database"));

	}

}
