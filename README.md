# Wells Fargo Counselor Web Application

This project is a backend system implemented in Java using Spring Boot and JPA, designed to model a financial advising system for Wells Fargo. This task was completed as part of the Forage Virtual Internship program.

## 📌 Project Objectives

- Design and implement a full data model using JPA.
- Establish entity relationships with appropriate annotations.
- Seed the database with initial data using a `DataLoader` class.

## 🏗️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- IntelliJ IDEA

## 🧩 Entity Overview

This project models the following entities:

- **Advisor**
- **Client**
- **Portfolio**
- **Security**

Each class is defined with:
- `@Entity` annotation
- Auto-generated primary keys
- Constructors
- Getters/Setters
- Relationship mappings using `@OneToMany`, `@ManyToOne`, etc.

## 🚀 Features

- ✅ Spring Boot 3.0.x
- ✅ Java 23 (also works with Java 17)
- ✅ Spring Data JPA with H2 in-memory database
- ✅ REST endpoint to check server status
- ✅ Sample data persistence using JPA repositories

---

## 📁 Project Structure

src/
└── main/
├── java/
│ └── com/
│ └── wellsfargo/
│ └── counselor/
│ ├── Entrypoint.java
│ ├── HomeController.java
│ ├── entity/
│ ├── repository/
│ └── service/
└── resources/
├── application.properties
└── static/


---

## ⚙️ Prerequisites

- Java 17+ (Java 23 supported)
- Maven 3.x
- Git

---

