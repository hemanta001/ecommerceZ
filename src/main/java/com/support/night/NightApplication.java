package com.support.night;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NightApplication {

	public static void main(String[] args) {
		System.out.println("I am at hello");
		SpringApplication.run(NightApplication.class, args);
	}

}
