# UserDataRest_Validation - Spring Boot REST API with Validation

A complete Spring Boot REST API application with data validation using @Valid annotations and proper error handling for user data management.

## Features

- **User CRUD Operations** - Create, Read, Update, Delete users
- **Data Validation** - @Valid annotation for input validation
- **Error Handling** - Proper exception handling and error responses
- **REST APIs** - Full RESTful endpoints

## Technology Stack

- **Java 17** - Programming language
- **Spring Boot** - Application framework
- **Spring Data JPA** - Database operations
- **Hibernate Validator** - Validation framework
- **MySQL** - Database
- **Maven** - Dependency management

## Validation Rules

| Field | Validation Rules |
|-------|------------------|
| Name | Not null, minimum 2 characters |
| Email | Valid email format |
| Password | Minimum 6 characters |
| Age | Minimum 18 years |

## How to Run

1. Configure database in `src/main/resources/application.properties`
2. Run `UserDataRestValidationApplication.java`
3. Access API at `http://localhost:8080`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/users` | Get all users |
| GET | `/api/users/{id}` | Get user by ID |
| POST | `/api/users` | Create user (with validation) |
| PUT | `/api/users/{id}` | Update user (with validation) |
| DELETE | `/api/users/{id}` | Delete user |

## Sample API Request (POST /api/users)

```json
{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "secure123",
    "age": 25
}
