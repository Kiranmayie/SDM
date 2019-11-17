package com.concordia.app.optimisticlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication

public class optimisticLock {
	
	public static void main(String args[])
	{
		new SpringApplicationBuilder(optimisticLock.class)
		.web(false)
		.run(args);
	}

}
