> ## Web App using Spring Boot

> ## Basic Boilerplate

- refer commit - 🎈First Home View and Controller

  - tomcat jasper
  - controller in springboot
  - view jsp->servlet in springboot
  - adding maven dependency

- No need of external tomcat server config's,springboot bootstrapped project has embeded tomcat server refer Maven Dependencies.
- In contrast to servlets, it is easier to manage & write controllers in Spring Boot
- Make sure to terminate(♦) red under console the current running tomcat embedded server when you run as spring boot app as each time you run it runs a new tomcat server.
- So when new changes make sure to terminate current tomcat embeded server before starting a new one.
- To display page in jsp a support need to be added (https://mvnrepository.com/) tomcat jasper, Make sure the tomcat embedded server core inside maven dependency dir matches with the tomcat jasper version.

      			# pom.xml
      			# add a new dependency
      			<!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jasper -->
      			<dependency>
      			    <groupId>org.apache.tomcat</groupId>
      			    <artifactId>tomcat-jasper</artifactId>
      			    <version>9.0.53</version>
      			</dependency>

- tomcat jasper will now automatically convert jsp into servlets, as ultimately their are servlets that are running in the background no matter which tech we are using while developing java based applications

---

> ## Application.Properties(Manual config) inside src/main/resources Files
**Used for configuration**
- contains key:value pairs
- use prefix & suffix + ctrl space for intelli sense inside application.properties


					# application.properties
					# specify prefix & suffix for views
					spring.mvc.view.prefix=/pages/
					spring.mvc.view.suffix=.jsp

---

> ## Accepting Client Data

- create a HttpServletRequest to grab client data
- refer HomeController.java inside src/main/java

- to give back response it can be
	- request dispatcher
	- response.redirect or send

- now springboot uses request dispatcher when we make use HttpServletRequest object

> IMPORTANT Request dispatcher& sendRedirect?
**We send two different request in case of SendRedirect, while same req,res object pair is forwarded in case of request dispatcher**

- calling a servlet (s1) from servlet(s2)
- i.e s1 calling s2 or vice a versa

						# Case-1 client make request to s1 and s1 sends back response
						C1--->S1 (req)
						S1---->C1 (res)
						
						# Case-2 S1 do not immediately sends response instead make the request further to servlet S2
						C1---> S1  (req,res)

- **S1 servlet can call s2 via Request Dispatcher(rd)**

						S1---> S2 (pass on req,res from S1 to S2 via rd)
						S2---->C1 (sends back the same object res from S2(servlet2) to C1(client))
												
- **as a client i.e browser do not knows how the request is being handled internally and passed to two different servlet**

> Now the request dispatcher works perfectly when both the servlets are on the same domain

> SendRedirect(), However say S1 is xyz.com and S2 is paypal , and client wants to donate to xyz.com via paypal (Request dispatcher cannot be used in this case)

- **In these type of case S1 will redirect the browser/client to paypal servers so that client can directly interact with the paypal servers via S2**

- **here we make use of SendRedirect(), where S1 will inform client and then redirect them to S2 that is handling the payment service at paypal.com**
 
 
 						# case for SendRedirect()
 						C1->S1 (req1)
 						S1->C1 (informs & redirects C1 to S2 )
 						C1->S2 (req2,res2)
 						
- **Also if additional data need to be passed from S1 to S2 in SendRedirect() scenario then we have to maintain sessions**


>EL(expression language)  to display data at view(client side)

**The Expression Language (EL) simplifies the accessibility of data stored in the Java Bean component, and other objects like request, session, application etc.**

---

> ## Model&View in SpringBoot without using servlet request,response objects

- refer commit 🎈 Use Model&View not session or req,res object
	- grabbing 'myname' as 'name' in request param
	-To match the request param key if it is passed as
	- localhost:8080/home?myname=SomeName
	- than  for myName  to be treated as name we use annotation
	- @RequestParam("myname") -> becomes name at Home controller

**When passing multiple params using RequestParam() is a great choice**

---

> ## Omitting the use of HttpSession to pass data
**when we are passing data(model) & view to DispatcherServlet**

- **IMPORTANT A COMBINATION OF MODEL&VIEW WHERE MODEL MEANS DATA, CAN BE USED TO OMIT THE USE OF HttpSession to pass data in SpringBoots**

> what is DispatcherServlet
**The DispatcherServlet is the front controller(that processes which request will go to which controller) in Spring web applications. It's used to create web applications and REST services in Spring MVC.**

---

> ## Model Object (refer HomeController.java)
 
 **refer Alien.java inside src/main/java we want to send aid,aname & lang from client as request params**
 
> 💡 the idea is to accept these three params as single object rather than three different variables

				http://localhost:8080/home?aid=1&aname=john&lang=python
				Welcome User: 1 , john , python (from Home View) 