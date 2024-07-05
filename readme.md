# Spring Boot Project: User-Service and WebClient

This project demonstrates how to build two Spring Boot applications: one using traditional Spring Web and the other using reactive Spring WebFlux. The applications are designed to communicate with each other using WebClient, showcasing asynchronous and non-blocking API calls.

## Project Structure

1. **User-Service**
   - A Spring Boot web application that provides APIs for managing user data.
   - Uses traditional Spring Web.
   - Dependencies:
     - Spring Web
     - Lombok
     - MySQL Driver
     - Spring Data JPA
     - Spring Boot DevTools

2. **WebClient Project**
   - A Spring Boot web application for testing API calls using WebClient.
   - Uses reactive Spring WebFlux.
   - Dependencies:
     - Spring Reactive Web
     - Spring Web
     - Lombok
     - Spring Boot DevTools

## Configuration

### User-Service

1. Configure your MySQL database settings in `application.properties`.
2. Build and run the application.
3. Access the APIs provided by the User-Service.

### WebClient Project

1. Configure the base URL for the User-Service in `application.properties`.
2. Build and run the application.
3. Use WebClient to call the User-Service APIs asynchronously.

## Usage

1. Clone this repository.
2. Set up and run both applications.
3. Test the communication between the WebClient and the User-Service.
4. Explore the code to understand how WebClient works in a reactive environment.