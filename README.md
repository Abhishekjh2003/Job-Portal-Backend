# 🚀 HireHub - Job Portal Backend

A secure Job Portal Backend application developed using Spring Boot, Spring Security, JWT Authentication, and PostgreSQL.  
The system allows users to securely register, log in, and access protected REST APIs using JWT-based authentication.

---

# 📌 Features

- User Registration
- User Login Authentication
- JWT Token Generation & Validation
- BCrypt Password Encryption
- Protected REST APIs
- PostgreSQL Database Integration
- Spring Security Integration
- Layered Architecture
- Exception Handling

---

# 🛠 Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- PostgreSQL
- Spring Data JPA
- Maven
- Lombok
- Eclipse IDE

---

# 📂 Project Structure

```text
src/main/java
│
├── config
│   ├── AppConfig.java
│   └── SecurityConfig.java
│
├── controller
│   └── UserController.java
│
├── dto
│
├── entity
│   ├── User.java
│   └── Role.java
│
├── exception
│   └── GlobalExceptionHandler.java
│
├── repository
│   └── UserRepository.java
│
├── security
│   ├── JwtFilter.java
│   ├── JwtService.java
│   └── CustomUserDetailsService.java
│
├── service
│   ├── UserService.java
│   └── UserServiceImpl.java


---


🗄 Database Schema

users Table
Column	Type
id	BIGINT (PK)
name	VARCHAR
email	VARCHAR
password	VARCHAR
role	VARCHAR
enabled	BOOLEAN



---
🔐 Authentication Flow

User registers using email and password
Password is encrypted using BCrypt
User logs in with credentials
JWT token is generated
Token is sent in Authorization header
JwtFilter validates token
Protected APIs become accessible



---
📮 API Endpoints

Register User
POST /api/users/register

---

# Sample Request
{
  "name": "Abhishek",
  "email": "abhishek@gmail.com",
  "password": "12345",
  "role": "JOB_SEEKER"
}

---

# Login User
POST /api/users/login

---

# Sample Request
{
  "email": "abhishek@gmail.com",
  "password": "12345"
}

---

# Get User Details
GET /api/users/{email}

---



# Authorization Header
Authorization: Bearer your_jwt_token

---


▶️ How to Run

Clone the repository
Open project in Eclipse IDE
Configure PostgreSQL database
Update database credentials in application.properties
Run HireHubApplication.java


---

⚙️ Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/hirehub
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
server.port=8081

---


🔒 Security Features

JWT Authentication
BCrypt Password Encryption
Stateless Session Management
Protected REST APIs
Spring Security Filter Chain
🚀 Future Enhancements
Job Posting Module
Resume Upload
Email Verification
Role-Based Authorization
Refresh Tokens
Swagger API Documentation

---

👨‍💻 Author

Abhishek Huded
Java Backend Developer

⭐ Support

If you like this project, give it a star on GitHub ⭐