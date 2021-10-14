package com.jasmeet.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jasmeet.demo.dao.AlienRepo;
import com.jasmeet.demo.model.Alien;

@Controller
public class AlienController {
	
	// 🎈 looks for the bean object inside spring container from AlienRepo
	// Autowiring feature of spring framework enables you to inject the object dependency implicitly
	@Autowired
	AlienRepo repo;
	
	//🎇 controller to return home view when localhost:8080/ is hit
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	//🎇 controller to handle new Alien submit form from client side 
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) 
	{
		// ✔ In params , Alien model object to pass aid,aname & language as object to backend from client
		
		// ✨ save the new Alien to db using the object dependancy autowired
		repo.save(alien);
		return "home.jsp";
	}
}