# Loan Management System

## Overview

The **Loan Management System** is a full-stack web application designed to streamline the process of managing loans. It allows users to apply for loans, track repayment schedules, and for administrators to manage loan approvals and disbursements. This project is built using Java (Spring Boot) for the backend, and React.js for the frontend.

## Features

- User-friendly loan application process
- Loan approval and disbursement management
- Loan repayment tracking
- Secure user authentication
- Administrator dashboard for managing users and loans
- RESTful APIs for data handling
- Responsive web design for mobile and desktop

## Tech Stack

### Backend
- **Java** (Spring Boot)
- **Spring Security** (for authentication)
- **Spring Data JPA** (for database interaction)
- **MySQL** (Database)
- **Hibernate** (ORM)
- **Maven** (Build tool)

### Frontend
- **React.js** (JavaScript library for building UI)
- **Axios** (for API calls)
- **Bootstrap** (for responsive design)
- **React Router** (for routing)

### Other Tools
- **Git** (Version control)
- **Postman** (API testing)
- **Docker** (for containerization, optional)
- **JUnit** (for unit testing)

## Prerequisites

Before running this project, ensure you have the following installed:

- **Java 11** or higher
- **Node.js** (for frontend development)
- **MySQL** (or any other compatible SQL database)
- **Maven** (for managing Java dependencies)

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/loan-management-system.git
    cd loan-management-system
    ```

2. **Backend setup**:

    - Navigate to the backend directory:
      ```bash
      cd backend
      ```
    - Update `application.properties` with your database configuration:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/loan_db
      spring.datasource.username=your_db_user
      spring.datasource.password=your_db_password
      ```
    - Build and run the Spring Boot backend:
      ```bash
      mvn clean install
      mvn spring-boot:run
      ```

3. **Frontend setup**:

    - Navigate to the frontend directory:
      ```bash
      cd frontend
      ```
    - Install dependencies:
      ```bash
      npm install
      ```
    - Start the React development server:
      ```bash
      npm start
      ```

## Usage

1. Access the application at `http://localhost:3000` for the frontend, and the backend runs on `http://localhost:8080`.
2. Create a new user, apply for a loan, and track repayments.
3. Admins can log in to approve loan requests and manage users.

## API Endpoints

- `POST /api/auth/login`: Authenticate users.
- `GET /api/loans`: Fetch all loan applications.
- `POST /api/loans`: Create a new loan application.
- `PUT /api/loans/{id}`: Update loan details.
- `DELETE /api/loans/{id}`: Delete a loan application.

## Testing

To run unit tests for the backend:

```bash
mvn test
