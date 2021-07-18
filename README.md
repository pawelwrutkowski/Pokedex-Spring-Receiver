# Pokedex Spring
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Features](#features)
* [Setup](#setup)
* [Project status](#project-status)
* [Acknowledgements](#acknowledgements)
* [Contact](*contact)
## General Info
- It's one half of the project: REST API for accessing and managing Pokemons database.
- The reason for creating this program was to practice codewriting and technologies learned on the course (i.a. Java, Spring Boot, SQL), and making two services (Spring and Angular) cooperate.
## Technologies
Project is created with:
- Java 15.0.1
- Spring Boot 2.5.0
- Spring Security 5.5.0
- MySQL 8.0.22
## REST Features
- Add Pokemon Post Controller
- Get all Pokemons Get Controller
- Find by number Get Controller
- Find by name Get Controller
## Setup
- Clone this repo to your desktop and run npm install to install all the dependencies.
- At the end update file application.properties - change username and password to your SQL Server & URL path
- Uncomment DbInit file, and change in application.properties the spring.jpa.hibernate.ddl-auto property to "create"
- Run your application in Web browser for the first time to create database.
- Comment DbInit file, and change in application.properties the spring.jpa.hibernate.ddl-auto property to "validate"
- Application is ready to use (default url: http://localhost:8080)
## Project status
Project is: working but being modified to add more functionalities. .
## Acknowledgements
This project was inspired by the desire to create practice coding and making two services, Spring and Angular, to cooperate.
Created by
- Paweł Rutkowski - @pawelwrutkowski
Feel free to contact me!
