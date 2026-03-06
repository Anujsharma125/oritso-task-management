# oritso-task-management
# Task Management System

## Overview

This project is a Task Management System developed using Java Spring Boot, Thymeleaf and MySQL.

Users can manage tasks using the following operations:

Create Task  
Read Task  
Update Task  
Delete Task  
Search Task  

---

## Technologies Used

Backend  
Java  
Spring Boot  
Spring Data JPA  

Frontend  
HTML  
CSS  
Thymeleaf  

Database  
MySQL  

Tools  
Eclipse IDE  
GitHub  
Maven  

---

## Application Architecture

This project follows MVC architecture.

Model  
Entity classes representing database tables.

View  
HTML pages using Thymeleaf templates.

Controller  
Handles HTTP requests and business logic.

---

## Features

Create task  
View tasks  
Update task  
Delete task  
Search tasks  

---

## Database Structure

Table Name: tasks

Columns:

id  
title  
description  
due_date  
status  
remarks  
created_by  
updated_by  
created_on  
updated_on  

---

## Home Page

The home page displays all tasks with search functionality.

![Home Page](images/home-page.png)

---

## Add Task Page

Users can create new tasks using this form.

![Add Task](images/add-task-page.png)

---

## Update Task Page

Users can update task details.

![Update Task](images/update-task-page.png)

## Environment Setup

Required Software:

Java JDK 17+  
MySQL  
Eclipse IDE  

---

## Database Setup

Create database:

CREATE DATABASE taskdb;

---

## Run Project

Run:

TaskmanagerApplication.java

Then open:

http://localhost:8080

---

## How to Run the Project

1. Clone the repository

git clone https://github.com/Anujsharma125/oritso-task-management

2. Open the project in Eclipse 

3. Configure MySQL database in application.properties

4. Run the Spring Boot application

5. Open browser and go to:

http://localhost:8080

---

## Author

Anuj Sharma  
B.Tech Computer Science Engineering
