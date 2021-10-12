package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		// 🎇 .run method
		// ctrl+run to see static ConfigurableApplicationContext class structure
		// initializes a spring container,you can compare this spring container to JVM container
		// spring container are core of spring framework that has DI to manage components via objects called spring beans
		// it creates , manages & configure objects 
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		// 🎇 .getBean method
		// instead of hardcoding the object
		// spring container creates & injects Alien class object inside this class as a dependency injection
		// note that spring follows the singleton approach where it already has created the object
		// i.e even if the two below lines are commented , the console would have a object created message due to its singleton approach
		Alien a = context.getBean(Alien.class);
		a.show();
		
		// 🎇 default singleton design pattern/scoping of spring
		// even if we have made another object 
		// still the spring container will only have a single instance created 
		// which will be then accessible by springBean
		// 🎇 if specified scope as prototype then it creates different objects each time a getBean() method is called
		Alien a1 = context.getBean(Alien.class);
		a1.show();
			
		// 🎈 NOTE- if scope value as prototype in Alien class then, 
		// If we dont call .getBean method at all i.e comment out 23,24,31,32 line
		// then their will be no pre-object creation unlike in singlton where pre-object creation happens even when we have not used .getBean method at all
		
	}

}
