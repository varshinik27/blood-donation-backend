# 🩸 Blood Donation Management System – Backend

## 📌 Project Overview
The Blood Donation Management System backend is developed using **Spring Boot**.  
It provides REST APIs to manage blood donors, their availability, and blood group–based search.

This backend connects to an **H2 in-memory database** and supports full **CRUD operations**.

---

## ⚙️ Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- IntelliJ IDEA

---

## 🧩 Features
- Register a new blood donor
- View all donors
- Search donors by blood group
- Update donor details and availability
- Delete donor records
- H2 Console for database view

---

## 🏗️ Project Structure
src/main/java
└── com.bloodbank.blooddonationsystem
├── controller
├── service
├── repository
├── entity
└── BloodDonationSystemApplication.java


---

## 🗄️ Database Details
- Database: H2 (In-Memory)
- URL: `jdbc:h2:mem:blooddb`
- Username: `sa`
- Password: (empty)

H2 Console:
http://localhost:8080/h2-console


---

## 🔌 API Endpoints

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/donors` | Add new donor |
| GET | `/api/donors` | View all donors |
| GET | `/api/donors/blood/{group}` | Search by blood group |
| PUT | `/api/donors/{id}` | Update donor |
| PATCH | `/api/donors/{id}/availability` | Update availability |
| DELETE | `/api/donors/{id}` | Delete donor |

---

## ▶️ How to Run Backend
1. Open project in **IntelliJ**
2. Ensure Java 17 is configured
3. Run:
BloodDonationSystemApplication.java

4. Server runs on:
http://localhost:8080


---

## 🎯 Purpose of the Project
This project helps hospitals and blood banks quickly find available donors and manage donor records efficiently.

---

## 👩‍💻 Developed By
- Varshini K
