package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbSpringBootGitAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(SbSpringBootGitAppApplication.class, args);
		int i=0;
		System.out.println("love you god");
	        applicationContext.close();
	}

}
