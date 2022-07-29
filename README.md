# Backend Development using SpringBoot

This particular application is for Student Management System,Course Management System and Result Management System
Details of this Project is given below.

## Student Management System
This system have following classes:

1. StudentController.java
2. Student.java
3. StudentRepository.java

### StudentController.java
This class have different methods like:

1. @GetMapping : This method is use for get the list of all Students and get pertucular Student by its id.

2. @PostMapping : This method is use for add the new Student details.

3. @PutMaping : This method is use for update Student information.

4. @DeleteMaping : This method is use for delete Student information.

### Student.java

This class have variables like id,name and address where id is the primary key,also it have constructors, getters and setters. 

### StudentRepository.java

This is basically a Interface.


## Course Management System & Result Management System 

Similarly,like Student Managemet System these two systems are use for course and result related methods.

## Check System methods using Postman

We can check GET,PUT,POST,DELETE mapping using postman api platform.

It can also check using VS code.We have to install Thuder Client for it.

## My SQL Server

We will store our Student, Course and Result related information in this by creating our DataBase.

# How to use this project in IntelliJ IDEA ?

1. First follow this step for installing Spring Boot in your ide

   File menu -> Settings -> Plugins -> Search Spring Initializr and Assistant and then click on Install.

2. You can Download the Zip file of code by clicking on the top of the page named Code -> Download Zip and then open it into your IDE

3. You can use this project by another way in your IDE by following steps:
   
   File menu -> New -> Project From Version Control -> Version Control: Git -> Enter the url: https://github.com/Jay20IT043/studentmgmtsystem -> Choose Directory -> Clone
