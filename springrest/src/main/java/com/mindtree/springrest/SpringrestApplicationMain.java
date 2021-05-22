package com.mindtree.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringrestApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplicationMain.class, args);
		// This is the change made to change a file and commit and push/commit to the repository
		System.out.println("Changes made to Spring rest application");
	}

}
