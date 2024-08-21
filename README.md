# ManufacturersRepo

## Overview
**ManufacturersRepo** is an API developed by Makersharks to enable buyers to search for manufacturers based on customized criteria such as location, nature of business, and manufacturing processes. The API also includes features for user registration, authentication, and secure account management.

## Features
- **Search Manufacturers**: Retrieve manufacturers filtered by location, nature of business, and manufacturing processes.
- **Pagination**: Support for handling large result sets.
- **User Registration**: Secure registration for new users.
- **User Authentication**: JWT-based authentication for users.
- **Email Validation**: Activation of user accounts via email validation codes.
- **Security**: Implementation of security best practices using Spring Security and JWT.
- **Input Validation & Sanitization**: Ensures valid and clean input data.
- **Exception Handling**: Centralized and robust error management.

## Prerequisites
- **Java 11** or higher
- **Maven** or **Gradle**
- **Docker** (for running the Docker Compose file)
- **Spring Boot**

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/Phillips-41/ManufacturersRepo.git
```
### 2. Run the docker-compose file
```bash
  docker-compose up -d
  ```
### 3. Navigate to the book-social-network directory:
```bash
  cd ManufacturersRepo
 ``` 
### 4. Install dependencies (assuming Maven is installed):
```bash
  mvn clean install
  ```
### 5. Run the application but first replace the x.x.x with the current version from the pom.xml file
```bash
  java -jar target/ManufacturersRepo-x.x.x.jar
  ```
### Access the API documentation using Swagger UI:
### API Endpoints:



####  Description: Register a new user account.




```http
  POST  http://localhost:8087/auth/register 
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `firstname` | `string` | **Required**. Your API key |
| `lasttname` | `string` | **Required**. Your API key |
| `email` | `string` | **Required**. Your API key |
| `password` | `string` | **Required**. Your API key |



## User Authenticate via email

#### Description: Authenticating user via Email .



#### you can see email validation code through end point through your : http://localhost:1080/#/
## Email Validation
#### Description: Validate a new user account using the email validation code.
```http
  POST http://localhost:8087/auth/activate-account 
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `validationCode`      | `string` | **Required**. your code |



## User Authentication

#### Description: Log in to an existing user account.

```http
  POST http://localhost:8087/auth/authenticate 
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `email`      | `string` | **Required**. your email |
| `password`      | `string` | **Required**. your password |

## Fetch a List of Manufacturers

#### Description: Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.
```http
  POST  http://localhost:8087/auth/register 
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `location` | `string` | **Required**. Your API key |
| `nature_of_business` | `string` | **Required**. Your API key |
| `manufacturing_processes` | `string` | **Required**. Your API key |



## Response
JSON

[
  {
    "supplier_id": "12345",
    "company_name": "ABC Manufacturing",
    "website": "http://abcmanufacturing.com",
    "location": "India",
    "nature_of_business": "small_scale",
    "manufacturing_processes": ["3d_printing"]
  }
]


## Security
The API is secured using Spring Security and JWT. Ensure you have the necessary configurations in place for authentication and authorization.

## Exception Handling
Global exception handling is implemented to manage errors gracefully.

## Documentation
API documentation is available via OpenAPI. Access it at http://localhost:8087/swagger-ui/index.html.
