package com.example.SpringBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//	1-this annotation does the following:
//	2-sets up default config
//	3-starts spring application context - "Spring" is container for all the code that runs on the application server,
//	biz, controller and data services, spring acts as a controller for all these diff. services,
//	this container is called the application context, and this runs when spring application runs,
//	and the spring-boot-starter creates this application context
//	4-performs a class path scan- scans all the other classes for annotations, whether for controller, services etc
//	5-starts Tomcat server
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
		//	takes 2 arguments, one is class and the other is cmd line args that you've passed to the main method
	}

}
