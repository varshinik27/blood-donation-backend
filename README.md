🩸 Blood Donation Management System – Backend
📌 Project Overview

The Blood Donation Management System – Backend is a RESTful web application developed using Spring Boot.
It provides APIs to manage blood donors, their availability, and blood group–based search.

The backend uses an H2 in-memory database for development and demonstration purposes and supports full CRUD operations.

⚙️ Technologies Used

Java 17

Spring Boot

Spring Data JPA

H2 Database

Maven

Docker

SonarQube

GitHub Actions (CI)

IntelliJ IDEA

🧩 Features

Register a new blood donor

View all donors

Search donors by blood group

Update donor details

Toggle donor availability

Delete donor records

RESTful API architecture

Dockerized backend

Code quality analysis using SonarQube

Automated build using GitHub Actions

🏗️ Project Structure
src/main/java
 └── com.bloodbank.blooddonationsystem
     ├── controller
     ├── service
     ├── repository
     ├── entity
     └── BloodDonationSystemApplication.java

🗄️ Database Details

Database: H2 (In-Memory)

JDBC URL: jdbc:h2:mem:blooddb

Username: sa

Password: (empty)

🔎 H2 Console (Local Only)
http://localhost:8080/h2-console


⚠️ Note
H2 is an in-memory database. Data will be lost on application restart or redeployment.
In cloud deployment (Render), a persistent database like PostgreSQL is recommended.

🔌 API Endpoints
Method	Endpoint	Description
POST	/api/donors	Add new donor
GET	/api/donors	View all donors
GET	/api/donors/blood/{group}	Search by blood group
PUT	/api/donors/{id}	Update donor
PATCH	/api/donors/{id}/availability	Update availability
DELETE	/api/donors/{id}	Delete donor
▶️ How to Run Backend (Local)
Step 1: Open Project

Open the project in IntelliJ IDEA

Ensure Java 17 is configured

Step 2: Run Application

Run the main class:

BloodDonationSystemApplication.java

📸 Build Backend
<img width="1073" height="580" alt="Build Backend" src="https://github.com/user-attachments/assets/564c9a0c-3935-4f84-847c-33ee30f0aab0" />
Step 3: Access APIs
http://localhost:8080/api/donors

🔍 Code Quality Analysis – SonarQube

SonarQube is used to analyze code quality and detect bugs, vulnerabilities, and code smells.

Step 1: Start SonarQube using Docker
docker run -d --name sonarqube -p 9000:9000 sonarqube


Access dashboard:

http://localhost:9000

Step 2: Run Sonar Analysis
mvn clean verify sonar:sonar \
-Dsonar.projectKey=blood-donation-backend \
-Dsonar.host.url=http://localhost:9000 \
-Dsonar.login=YOUR_SONAR_TOKEN

📸 SonarQube Screenshots
<img width="1920" height="1080" alt="Sonar Dashboard" src="https://github.com/user-attachments/assets/d4ddc765-4bca-486d-8955-87d39cacc226" /> <img width="1084" height="584" alt="Sonar Report" src="https://github.com/user-attachments/assets/26cc8dfb-a2b0-4a1d-b285-ab7ba2faa9e3" />
🐳 Dockerization

The backend application is containerized using Docker for consistent deployment.

Dockerfile
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

Build Docker Image
docker build -t blood-donation-backend .

Run Docker Container
docker run -p 8080:8080 blood-donation-backend

📸 Docker Screenshot
<img width="1089" height="576" alt="Docker Run" src="https://github.com/user-attachments/assets/7c907c6f-2dcc-4b42-b692-c9e0af6010f2" />
⚙️ CI/CD – GitHub Actions

GitHub Actions is used to automatically build the backend application on every push.

Workflow File
.github/workflows/backend-ci.yml

name: Backend CI

on:
  push:
    branches: [ main ]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v3

    - name: Set up Java 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'

    - name: Build with Maven
      run: mvn clean install

📸 GitHub Actions Screenshot
<img width="1893" height="964" alt="GitHub Actions Build" src="https://github.com/user-attachments/assets/663a07af-233f-4a27-a555-61e9a84509b8" />
🚀 Deployment Flow
Developer Push
   ↓
GitHub Repository
   ↓
GitHub Actions (Build)
   ↓
Docker Image
   ↓
Render Deployment

🎯 Purpose of the Project

This project helps hospitals and blood banks quickly identify available blood donors and manage donor records efficiently during emergencies.

🔮 Future Enhancements

Persistent database (PostgreSQL / MySQL)

User authentication & authorization

Notification system (Email / SMS)

Role-based access control

👩‍💻 Developed By

Varshini K
