# Inventory-Management-System
The Inventory Management System is a Spring Boot application designed to manage suppliers and products efficiently. It allows users to add, view, update, and delete suppliers and products while ensuring data integrity. The system provides a RESTful API for seamless integration with frontend applications.

Features

Manage suppliers and products with CRUD operations

Prevent deletion of suppliers with existing products

Fetch products by supplier

Update existing suppliers and products

RESTful API endpoints

Database support for MySQL 

Technologies Used

Java, Spring Boot, Spring Data JPA, Lombok

MySQL

Maven

Installation & Setup

Clone the repository:

git clone https://github.com/your-repo/inventory-management.git
cd inventory-management

Configure the database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Build and run the application:

mvn clean install
mvn spring-boot:run

API Endpoints

Supplier Endpoints

Get All Suppliers: GET /suppliers

Get Supplier by ID: GET /suppliers/{id}

Add Supplier: POST /suppliers

Update Supplier: PUT /suppliers/{id}

Delete Supplier: DELETE /suppliers/{id}

Product Endpoints

Get All Products: GET /products

Get Product by ID: GET /products/{id}

Get Products by Supplier: GET /products/supplier/{supplierId}

Add Product: POST /products

Update Product: PUT /products/{id}

Delete Product: DELETE /products/{id}


Future Enhancements

Implement authentication & authorization (Spring Security)

Add a frontend using React or Angular

Improve validation and error handling

Contributors

Otshepahetse

License

This project is licensed under the MIT License - see the LICENSE file for details.
