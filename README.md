# Spring-Boot-Store
# Desciption

Building a Simple Spring-like Dependency Injection Framework in Java. Combine reflections and annotations to build powerful libraries and frameworks. Frameworks like Spring, Hibernate, etc. make the life of java programmers easy. These frameworks give us a lot of superpowers. For e.g., you can magically inject objects in spring by annotating with just an Autowired annotation. In this mini project, I used all the tools we learned to get a successful output of a token. 

#Technologies
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
- ![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
- ![PostgresSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
- Maven 
- Springboot 

# How I started and finshed 

- First I did a diagram for my users, products, and orders. Once I started by ERD I added two dependecies to my pom.xml. I added the spring io framework and maven dependencies. My appoach for the project was to keep it simple and keep it the way we did the demo in class becasuse the dependecies I used are the ones we used in class. Once I finished my ERD and did my notes, I was ready to code. I did a t-shirt store theme. Next I started on my resources package and coded my server in the application properties and started my application-dev properties. After that I started my product/user controller which will bring everything all together. Now it’s time to work on all the user codes, the product code, and the order code. These consist of all the getter and setter and constructors which will make the tables is pgAdmin. Before I start the step above I need to add the Jpa dependency in the pom.xml.

- Once I finish all of the above. I started my security package. Lastly I finished coding my User Service, Product Controller, and User Controller. The link to my ERD is below. 

- https://lucid.app/lucidspark/d22a69f7-928b-4ed7-9ef3-cf02cef1e3fb/edit?viewport_loc=225%2C-363%2C2221%2C1001%2C0_0&invitationId=inv_c083825b-3710-4430-a2fb-4bf433ffe01b

# Depencies 

- Springboot.io

- Maven 

Security 
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

JWE, JWS, and JWT
<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api -->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.11.5</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-impl -->
<dependency>
  <groupId>io.jsonwebtoken</groupId>
  <artifactId>jjwt-impl</artifactId>
  <version>0.11.5</version>
  <scope>runtime</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-jackson -->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-jackson</artifactId>
    <version>0.11.5</version>
    <scope>runtime</scope>
</dependency>

# Hurdles and Wins 

- I had a lot of hurdles. From coder block to missing steps. The wins for me was doing it alone I understood alot more of what I was doing.

# Credits 

- Thank you to Deshe Woods for always helping me when needed. 


 
