# ManufacturersRepo
## Overview
Makersharks is building a search page where buyers can search for manufacturers based on their customized requirements. This API allows users to retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.

## Features
- Retrieve manufacturers based on location, nature of business, and manufacturing processes.
- Pagination support for large result sets.
- Input validation and sanitization.
- Exception handling and security best practices.
- **User Registration**: Users can register for a new account.
- **Email Validation**: Accounts are activated using secure email validation codes.
- **User Authentication**: Existing users can log in to their accounts securely using JWT tokens.

## Prerequisites
- Java 11 or higher
- Maven or Gradle
- Spring Boot

## Getting Started
Setup Instructions
To set up the backend of the Book Social Network project, follow these steps:

## Clone the repository:
   git clone https://github.com/Phillips-41/ManufacturersRepo.git
## Run the docker-compose file
  docker-compose up -d
## Navigate to the book-social-network directory:
  cd ManufacturersRepo
## Install dependencies (assuming Maven is installed):
  mvn clean install
## Run the application but first replace the x.x.x with the current version from the pom.xml file
  java -jar target/ManufacturersRepo-x.x.x.jar
### Access the API documentation using Swagger UI:


## API Endpoints
### User Registration
### Endpoint: /auth/register
### Method: POST
###  Description: Register a new user account.

Request Body
JSON

{
 "firstname" : "firstname",
  "lastname"  : "lastname",
  "email"     : "name@gmail.com",
  "password"  :"password11"
  
}
Example curl Command
curl -X POST http://localhost:8087/auth/register \
     -H "Content-Type: application/json" \
     -d '{
          "firstname" : "firstname",
          "lastname"  : "lastname",
          "email"     : "name@gmail.com",
          "password"  :"password11"
         }'
User Authenticate
Endpoint: /auth/authenticate
Method: POST
Description: Authenticating user via Email .

Request Body
JSON
{
  "email"     : "name@gmail.com",
  "password"  :"password11"
  
}
Example curl Command
curl -X POST http://localhost:8087/auth/authenticate \
     -H "Content-Type: application/json" \
     -d '{
        
          "email"     : "name@gmail.com",
          "password"  :"password11"
         }'
you can see email validation code through end point through your :http://localhost:1080/#/
Email Validation
Endpoint: /auth/activate-account
Method: POST
Description: Validate a new user account using the email validation code.

Request Body
JSON

{

  "validationCode": "123456"
}

Example curl Command
curl -X POST http://localhost:8087/auth/validate \
     -H "Content-Type: application/json" \
     -d '{
           "validationCode": "123456"
         }'

User Authentication
Endpoint: /api/auth/login
Method: POST
Description: Log in to an existing user account.

Request Body
JSON

{
  "username": "existinguser",
  "password": "password123"
}

Example curl Command
curl -X POST http://localhost:8087/auth/login \
     -H "Content-Type: application/json" \
     -d '{
           "username": "existinguser",
           "password": "password123"
         }'

Fetch a List of Manufacturers
Endpoint: /api/supplier/query
Method: POST
Description: Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.

Request Body
JSON

{
  "location": "India",
  "nature_of_business": "small_scale",
  "manufacturing_processes": ["3d_printing"]
}

Example curl Command
curl -X POST http://localhost:8087/api/supplier/query \
     -H "Content-Type: application/json" \
     -d '{
           "location": "India",
           "nature_of_business": "small_scale",
           "manufacturing_processes": ["3d_printing"]
         }'

Response
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

Security
The API is secured using Spring Security and JWT. Ensure you have the necessary configurations in place for authentication and authorization.

Exception Handling
Global exception handling is implemented to manage errors gracefully.

Documentation
API documentation is available via OpenAPI. Access it at http://localhost:8087/swagger-ui/index.html.
