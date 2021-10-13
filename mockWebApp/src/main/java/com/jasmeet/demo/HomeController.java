// 🎈 No external server needed spring boot comes with embeded tomcat server
package com.jasmeet.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//✨ A Spring MVC based controller
@Controller
public class HomeController {
	
	// ✨ maps with request home i.e  this method executes when home request is made
	@RequestMapping("home")
	public String home() {
		System.out.println("hi from home controller..");
		// 🎆 returns home view
		return "home";
	}
}


