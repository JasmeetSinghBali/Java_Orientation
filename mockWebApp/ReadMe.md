> ## Web App using Spring Boot

> Basic Boilerplate

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

> Application Properties Files
