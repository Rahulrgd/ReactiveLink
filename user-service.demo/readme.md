# User-Service

The **User-Service** is a Spring Boot web application that provides APIs for managing user data. It's designed to be used in conjunction with your "Webclient app."

## Features

- Add a new user
- Retrieve all users
- Retrieve a user by ID

## Dependencies

- Spring Web
- Lombok
- MySQL Driver
- Spring Data JPA
- Spring Boot DevTools

## API Endpoints

1. **Add User**
   - Endpoint: `POST /api/users`
   - Request Body: JSON representation of a user
   - Example:
     ```json
     {
       "firstName": "John",
       "lastName": "Doe",
       "age": "24"
     }
     ```

2. **Get All Users**
   - Endpoint: `GET /api/users`
   - Response: List of all users

3. **Get User by ID**
   - Endpoint: `GET /api/users/{id}`
   - Path Variable: `id` (User ID)
   - Response: Details of the user with the specified ID

## Usage

1. Clone this repository.
2. Configure your MySQL database settings in `application.properties`.
3. Build and run the application.
4. Access the APIs using the provided endpoints.