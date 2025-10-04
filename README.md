# Spring JPA + H2 Practice Project

This is a simple project built with **Spring Boot**, **Spring Data JPA**, and **H2 Database**.  
It demonstrates how to build a basic  REST API for managing users.

---

## 🚀 Features
- Spring Boot application using Maven.
- RESTful APIs for `User` entity.
- In-memory **H2 Database** for quick testing and development.
- Service layer for business logic.
- Repository layer using **Spring Data JPA**.

---

## 🗂️ Project Structure
src/main/java/com/mokshagna/JPA_H2
├── controller # REST Controllers
├── model # Entity classes (User)
├── repo # Repository interfaces
└── service # Business logic layer


---

## ⚙️ Prerequisites
- [Java 17+](https://adoptopenjdk.net/)
- [Maven 3.8+](https://maven.apache.org/)
- IDE of your choice (e.g., IntelliJ IDEA, VS Code, Eclipse)

---

## 🛠️ Setup & Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/spring-jpa-h2.git
   cd spring-jpa-h2
Build the project:

mvn clean install


Run the application:

mvn spring-boot:run


The app will start at: http://localhost:8080

8080

📂 H2 Database Console

Access the H2 console at: http://localhost:8080/h2-console

Default JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

Make sure these match the settings in src/main/resources/application.properties.

🛣️ API Endpoints
Method	Endpoint	Description
GET	/users	Get all users
GET	/users/{id}	Get user by ID
POST	/users	Add new user

🧪 Testing

You can test the APIs using:

Postman
 or

curl commands from the terminal.

Example:

curl -X POST http://localhost:8080/users \
     -H "Content-Type: application/json" \
     -d '{"name":"John Doe","email":"john@example.com"}'

📜 License

This project is for learning and practice purposes only.
Feel free to modify and use it as a reference in your own projects.
