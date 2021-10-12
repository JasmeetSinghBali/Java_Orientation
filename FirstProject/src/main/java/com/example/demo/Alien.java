package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 🎇 @component makes the Alien class as SpringBean 
// - singleton pattern is used when the beans are stateless
// - creates a object before even we have requested it
// - pre-creation of object
//🎇 @Scope with value enables prototype pattern
// - prototype pattern is mostly used in all beans that are statefull
// - will create a new instance of bean everytime when request is made to that specific bean
// - post-creation of object
@Component
// @Scope(value="prototype") 
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	
	// 🎈 we have to make sure that the Alien object is able to find the Laptop object inside spring container
	// ✨ This is done via Autowire
	// ✨ Autowire default search for object inside spring container by type
	// As Alien is dependent on Laptop object refer show function in this file
	@Autowired
	// 🎈 Alien object will search for laptop object named as lap1 inside the spring container refer Laptop.java
	// @Qualifier helps in search by name approach inside spring container
	@Qualifier("lap1")
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("object created..");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
		
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("message from Alien Class..'This is DI via spring container & component' ");
		// the Alien class is dependent on Laptop class
		laptop.compile();
	}
}
