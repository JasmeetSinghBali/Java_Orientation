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
	
	// 🎈 Grabbing aid,aname,lang as model object  
	public ModelAndView home(Alien alien) 
	{
		
		// 💡 creating a model&view object to pass data to dispatcherservlet(frontcontroller)
		ModelAndView mv = new ModelAndView();
		
		// 🎈 embedding model object {aid,aname,lang} to model&view object 
		mv.addObject("modelobj",alien); // a key:value pair passed as model(data) to dispatcherServlet
		mv.setViewName("home");
		
		// 🎆 returns home view + data(model) to dispatcherservlet without using HttpSession
		return mv;
	}
}


