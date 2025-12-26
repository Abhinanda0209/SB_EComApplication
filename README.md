SB_EComApplication — Spring Boot E-Commerce Backend

A simple, modular, and industry-style E-Commerce backend built with Spring Boot, Spring Security, JWT Authentication, JPA/Hibernate, and a layered architecture.
The project simulates a real-world product backend and follows clean coding principles.

📌 Features
1. User Authentication & Authorization

Registration & login with JWT

Role-based access (USER, ADMIN)

Secure endpoints using Spring Security

Cookie-based authentication supported

2. Product Management

CRUD operations for products

Category-based filtering

Pagination & sorting

Layered architecture: Controller → Service → Repository

3. Cart Management

Add products to cart

Update quantities

Remove items

Calculate total amount dynamically

Proper mapping between Cart → CartItem → Product

4. Order System

Convert cart to order

Track order status

Store order history per user

Payment simulation (no actual payment gateway yet)

5. Industrial-Grade Practices

DTO pattern

Global exception handling

Custom exceptions

Layer separation (Controller, Service, Repository)

Logging

Entity relationships mapped cleanly

📂 Project Structure
src/

     └── main/
         ├── java/com/aurora/sb_ecom
         │     ├── controller
         │     ├── service
         │     ├── model
         │     ├── repository
         │     ├── payload (DTOs)
         │     ├── security
         │     └── exception
         └── resources/
                ├── application.properties
                └── data.sql (optional)

🛠 Tech Stack

Java 17+

Spring Boot

Spring Security + JWT

Spring Data JPA

Hibernate

MySQL / PostgreSQL

Lombok (optional)

Maven

🚀 How to Run the Project
1. Clone the repo
git clone https://github.com/your-username/SB_EComApplication.git
cd SB_EComApplication

2. Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ecomdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3. Build & Run
mvn clean install
mvn spring-boot:run

## Run with Docker

Requirements:
- Docker
- Docker Compose\
 OR
- Docker Desktop

Run the application:

```bash
docker compose up --build
```

Access

App: Use postman with endpoints given below
pgAdmin: http://localhost:5050

Database (Postgres)\
host: db\
DB: ecomdb\
User: ecomuser\
Password: ecompass

📬 API Endpoints (Highlights)
Category:\
Get All Categories: GET http://localhost:8080/api/public/categories \
Create new Category: POST http://localhost:8080/api/public/categories \
Delete a Category : DELETE http://localhost:8080/api/admin/categories/{categoryId} \
Update a Category : PUT http://localhost:8080/api/admin/categories/{categoryId} \

Product:\
Add Product: POST http://localhost:8080/api/admin/categories/1/product \
Update Product: PUT http://localhost:8080/api/admin/products/{id}
**********TO BE ADDED***********

🧱 Architecture & Design

Layered Architecture
Separates presentation, business logic, and data access layers.

DTOs
Prevents exposing internal entity models.

Exception Handling
Custom exceptions + @RestControllerAdvice.

Secure Authentication
JWT tokens and cookie support.

Testability
Constructor injection throughout the codebase.

📈 Current Status

Product module complete

Cart module functional

JWT login working

Orders and payments integrated

More modules coming soon (wishlist, reviews, inventory)

👤 Author

Abhinanda Mannazhath Nandan
Backend Developer — Java | Spring Boot
Weimar, Germany
