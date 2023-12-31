# Student Management System

A Student Management System serves as the backbone of educational institutions, offering a comprehensive suite of tools to administer, organize, and optimize student data. It provides seamless functionalities for adding, updating, and deleting student records, ensuring efficient and organized management within the institution.
Tech Stack:
* Backend -- Java,SpringBoot
* Database -- SQL
* Frontend -- Thymeleaf,Html,BootStrap css4

## Description

Key Features:

Student Profile Creation: The system enables administrators or authorized personnel to add new student profiles effortlessly. Essential details such as Firstname, LastName and email are collected and stored securely within the database.

Update Student Information: With evolving details or changes in email, authorized users can easily update student records. Whether it's modifying personal information, email, or any other relevant data, the system allows for quick and accurate updates.

Delete Profile Creation: The system enables administrators or authorized personnel to delete the student profiles effortlessly.

## Getting Started

### Dependencies

* SpringWeb
* Lombok
* Spring Data Jpa
* Thymeleaf
* MySQLDriver

### Installing

* Download your program by using this url-(https://github.com/shkkr01/StudentManagement.git)
* Modification that need to be made is in application.properties file in which you need to add your own
  credentials for 
  spring.datasource.url=jdbc:mysql://localhost:3306/{your table name}
  spring.datasource.username={your username}
  spring.datasource.password={your password} 

### Executing program

* git pull https://github.com/shkkr01/StudentManagement.git
* Change the application.properties file with your credentials.
```
git pull https://github.com/shkkr01/StudentManagement.git
```

## Help

Any advise for common problems or issues.
```
Make sure you have chnaged the application.properties file with your sql server credendials.
```

## Authors

Contributors names and contact info

ex. Shubham Kumar  
(www.linkedin.com/in/shubham-kumar-0383351b4)

## Version History

* 0.1
    * Initial Release
