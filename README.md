#CRUD APP

This project is a RESTful API for managing categories and products using Spring Boot. It supports full CRUD operations and implements a one-to-many relationship between categories and products. The project uses JPA and Hibernate for persistence and provides server-side pagination for listing categories and products.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

- **CRUD Operations:** Full CRUD operations for categories and products.
- **One-to-Many Relationship:** A category can have multiple products.
- **Server-Side Pagination:** Paginated results for both categories and products.
- **Annotation-Based Configuration:** No XML configuration used, following Spring Boot best practices.
- **RDB Configuration:** Uses a relational database (RDB) instead of in-memory database for persistence.

## Technologies

- **Java 21**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **MySQL (or any RDB of your choice)**

## Getting Started

### Prerequisites

- JDK 17 or later
- Maven 3.8.x or later
- MySQL or any RDBMS of your choice

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/jyotiram7402/CRUD_APP_SpringBoot_Project-api.git
   cd crud-api
   ```

2. **Configure the database:**

   Update the `application.properties` file in the `src/main/resources` directory with your database configuration.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your-db-name
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. **Build the project:**

   ```bash
   mvn clean install
   ```

4. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

## API Endpoints

### Category CRUD Operations

1. **Get all categories (with pagination):**

   ```http
   GET /api/categories?page=3
   ```

2. **Create a new category:**

   ```http
   POST /api/categories
   ```

3. **Get category by ID:**

   ```http
   GET /api/categories/{id}
   ```

4. **Update category by ID:**

   ```http
   PUT /api/categories/{id}
   ```

5. **Delete category by ID:**

   ```http
   DELETE /api/categories/{id}
   ```

### Product CRUD Operations

1. **Get all products (with pagination):**

   ```http
   GET /api/products?page=2
   ```

2. **Create a new product:**

   ```http
   POST /api/products
   ```

3. **Get product by ID (with category details):**

   ```http
   GET /api/products/{id}
   ```

4. **Update product by ID:**

   ```http
   PUT /api/products/{id}
   ```

5. **Delete product by ID:**

   ```http
   DELETE /api/products/{id}
   ```

### One-to-Many Relationship

- Each category can have multiple products.
- When fetching product details, the response includes the associated category information.

## Database Configuration

The project uses a relational database (RDB) for persistence. Ensure your database is configured and running before starting the application. The default configuration is set for MySQL, but you can adjust it for other databases by updating the connection details in the `application.properties` file.

## Project Structure

```plaintext
src/
├── main/
│   ├── java/com.package com.Nimap.MachineTest.CRUD_APP;
│   │   ├── controller/  # REST controllers
│   │   ├── enity/       # Entity classes
│   │   ├── repository/  # Repository interfaces
│   │   ├── service/     # Service classes
│   └── resources/
│       ├── application.properties  # Application configuration
└── test/
    └── java/com.package com.Nimap.MachineTest.CRUD_APP/  # Unit and integration tests
```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request if you have any suggestions or improvements.

# Mail TO :jyotiramkamble7402@gmail.com


Feel free to adjust any specific details, such as project name, package structure, or database configuration, to match your actual project.

