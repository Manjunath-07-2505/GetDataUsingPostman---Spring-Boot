# 🚀 GetDataUsingPostman - Spring Boot GET API Project

## 📌 Project Description
GetDataUsingPostman is a simple Spring Boot REST API project that demonstrates how to fetch Employee data from a MySQL database using a GET request.  
The API is tested using Postman and returns employee details in JSON format.

---

## 🛠️ Technologies Used
- Java 17
- Spring Boot 3
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

---

## 📂 Project Structure
com.example.getdatausingpostman  
│  
├── controller  
├── service  
├── repository  
├── entity  
└── GetDataUsingPostmanSpringApplication.java  

---

## ⚙️ Database Configuration

Update the `application.properties` file:

spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



Make sure:
- MySQL server is running
- Database `testdb` exists

---

## 🔎 API Endpoint

### ✅ Fetch All Employees

GET http://localhost:8080/employees

Description:  
This endpoint retrieves all employee records from the database and returns them in JSON format.

---

## 🧪 Testing Using Postman

1. Open Postman
2. Select GET method
3. Enter URL:
   http://localhost:8080/employees
4. Click Send
5. View JSON response

---

## 📤 Sample Response

```json
[
  {
    "id": 1,
    "name": "Manjunatha",
    "salary": 50000
  },
  {
    "id": 2,
    "name": "Ravi",
    "salary": 60000
  }
]
