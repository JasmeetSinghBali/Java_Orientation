// 🎈 No external server needed spring boot comes with embeded tomcat server
package com.jasmeet.demo;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//✨ A Spring MVC based controller
@Controller
public class HomeController {
	
	// ✨ maps with request home i.e  this method executes when home request is made
	@RequestMapping("home")
	
	// 🎈 Grabbing 'myname' as 'name' from request params, from client with HttpSession object as parameters in springBoot  due to DI  
	// To match the request param key if it is passed as
	// localhost:8080/home?myname=SomeName
	// than  for myName  to be treated as name we use annotation
	// @RequestParam("myName") -> becomes name at controller
	public ModelAndView home(@RequestParam("myname") String name) 
	{
		
		// 💡 creating a model&view object to pass data to dispatcherservlet(frontcontroller)
		ModelAndView mv = new ModelAndView();
		
		// 🎈 embeding model & view to the object
		mv.addObject("myname",name); // a key:value pair passed as model(data) to dispatcherServlet
		mv.setViewName("home");
		
		// 🎆 returns home view + data(model) to dispatcherservlet without using HttpSession
		return mv;
	}
}


