package com.daniellogerstedt.Lab11Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Lab11Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab11Application.class);
	}

}
