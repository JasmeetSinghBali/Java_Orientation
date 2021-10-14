> ## Spring Boot JPA,H2 & MVC

> ### What do this Snippet achieve

- Add new User/Alien to DB (h2 in memory database via springboot JPA)
- Get/fetch all User/Alien from Db(h2 via springboot)

> ### snippet structure
				
				# Models & Controllers
				src/main/java
					* com.jasmeet.demo
					* com.jasmeet.demo.controller
						- AlienController
					* com.jasmeet.demo.model
						- Alien
				# Views
				src
					*main
				           *webapp
				              home.jsp

> Spring Boot JPA is a Java specification for managing relational data in 
Java applications. It allows us to access and persist data between Java object/ class and relational database

> H2 is an embedded, open-source, and in-memory database. It is a relational database management system written in Java. It is a client/server application. It is generally used in unit testing.

> ## Dev Logs

> how to enable h2 in memory database in spring boot

**providing the configs you need inside the src/main/resources application.properties**

					spring.h2.console.enabled=true
					spring.datasource.platform=h2
					spring.datasource.url=jdbc:h2:mem:alpacino

> To access h2 database go to localhost:8080/h2-console

- **dont change username or password**
- **specify the same JDBC URL in the h2-console as mentioned in application.properties**

		jdbc:h2:mem:testdb
		
- **just make a test connection, test succesfull**
- **Hit Connect & valah you got your h2 database access**


> Configuring JPA so that h2-console can detect mock table Alien

- **use annotations @Entity & @Id refer Alien.java inside com.jasmeet.demo.model**
- **relaunch spring boot app & check ALIEN table will be their**

				select * from alien
				# output
				empty table with AID,ANAME

> IMPORTANT make sure to add this in applicaion.properties  to avoid getting the not able to find table ALIEN, not able to process query inside data.sql 

**refer https://stackoverflow.com/questions/5763747/h2-in-memory-database-table-not-found**
		
		spring.jpa.defer-datasource-initialization=true

> Adding dummy data to Alien table (can be done either directly via h2-console sql statements)


		
- **Or by creating a seperate file inside src/main/resources as data.sql**
				
				*src/main/resources
					-data.sql
					
- **Since h2 is inmemory everytime the application is relaunched the data goes away so to fill dummy data everytime the spring boot application restarts a data.sql inside resources can be used**

					select * from alien in h2-console
					#ouptuts
					AID    ANAME
					101   alpacino
					
> Adding data in database via Data Access Object DAO

- ** Initialization of data access object, resource management and transaction management and exception handling are the main parts of persistence framework. Spring data access framework is provided to integrate with different persistence frameworks like JDBC, Hibernate, JPA, iBatis etc.**

- **writing JDBC code or in JPA, Hibernate a seperate class(code)via which new Alien model object can be added to table inside h2**

> General Steps

**Step 1 create interface/blueprint(new->interface)in seperate dao package inside main**
		
		src/main/java
			com.jasmeet.demo.dao
				AlienRepo
		
					
**Step 2(IMPORTANT) class that implements that interface but with spring rest their is no need to implement the CRUD functionalities just need to extend the CRUDfunctionality interface refer AlienRepo.java inside dao & then use the autowired object dependency injection that creates an object and insert the data in db automatically refer AlienController.java**
