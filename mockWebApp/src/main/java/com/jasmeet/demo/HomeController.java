// 🎈 No external server needed spring boot comes with embeded tomcat server
package com.jasmeet.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpServerErrorException;

//✨ A Spring MVC based controller
@Controller
public class HomeController {
	
	// ✨ maps with request home i.e  this method executes when home request is made
	@RequestMapping("home")
	// 🎈 creating a HttpServletRequest object to grab data from client side(views)
	public String home(HttpServletRequest req,HttpServletResponse res) 
	{
		// 🎇 passing data via session b/w servlets
		HttpSession session = req.getSession();
		
		// ✨ grab the params passed in request
		// localhost:8080/home?name=someName
		String name = req.getParameter("name");
		
		System.out.println("Hi "+ name +" (from Home controller)");
		
		// passes a key:value pair attribute from one Servlet to another
		session.setAttribute("name", name); //{"name",SomeName}
		
		// 🎆 returns home view
		return "home";
	}
}


