# Waste Sorting Mobile Application - REST API

This project is a Spring Boot application that provides RESTful APIs for a waste sorting mobile application. 
The application is designed to help users learn about proper waste disposal techniques and recycling habits. 
It includes functionalities for managing waste categories, disposal guidelines, and recycling tips.

## Features

- **Waste Categories**: Create, read, update, and delete waste categories.
- **Disposal Guidelines**: Manage disposal guidelines for different waste categories.
- **Recycling Tips**: Provide recycling tips for various types of waste.
- **Validation**: Input validation to ensure data integrity.
- **In-Memory Database**: Uses H2 in-memory database for easy setup and testing.

## Technologies Used

- Spring Boot: For building the RESTful web services.
- Spring Data JPA: For data access and persistence.
- H2 Database: In-memory database for development and testing.
- Maven: For dependency management and building the project.
- Postman: For testing the REST endpoints.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 23
- Maven 3.x
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Conethirtyseven/WasteSortingAPI


API Endpoints
Waste Categories:

GET /api/waste-categories: Get all waste categories.

GET /api/waste-categories/{id}: Get a specific waste category by ID.

POST /api/waste-categories: Create a new waste category.

PUT /api/waste-categories/{id}: Update an existing waste category.

DELETE /api/waste-categories/{id}: Delete a waste category.

Disposal Guidelines:

GET /api/disposal-guidelines: Get all disposal guidelines.

GET /api/disposal-guidelines/{id}: Get a specific disposal guideline by ID.

POST /api/disposal-guidelines: Create a new disposal guideline.

PUT /api/disposal-guidelines/{id}: Update an existing disposal guideline.

DELETE /api/disposal-guidelines/{id}: Delete a disposal guideline.

Recycling Tips:

GET /api/recycling-tips: Get all recycling tips.

GET /api/recycling-tips/{id}: Get a specific recycling tip by ID.

POST /api/recycling-tips: Create a new recycling tip.

PUT /api/recycling-tips/{id}: Update an existing recycling tip.

DELETE /api/recycling-tips/{id}: Delete a recycling tip.

Testing the API
You can use Postman or any other API testing tool to test the endpoints. The application runs on http://localhost:8080.

Accessing the H2 Database
To access the H2 database console, go to http://localhost:8080/h2-console and use the following credentials:

JDBC URL: jdbc:h2:mem:WasteSortingApp

User Name: sa

Password: password
