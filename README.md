# 🎓 Student Performance & Attendance Management System

[![CI/CD & Deploy Spring Boot App](https://github.com/bharg6368vr/stud/actions/workflows/deploy.yml/badge.svg)](https://github.com/bharg6368vr/stud/actions/workflows/deploy.yml)

A robust **Spring Boot 3** web application designed to track, manage, and analyze student records, attendance metrics, and academic performance evaluations with both an interactive **Thymeleaf UI** and **REST APIs**.

---

## 🚀 Key Features

* **Student Record Management (CRUD)**: Create, view, update, and delete student profiles with real-time validation.
* **Attendance Tracking**: Record student attendance percentages and flag low-attendance risks.
* **Academic Performance Analysis**: Automatically calculate average marks and categorize academic performance tier.
* **Interactive Web Interface**: Responsive Thymeleaf templates (`add`, `edit`, `view`, `index`).
* **RESTful API**: Clean REST endpoints under `/api/students` for frontend and microservice integrations.
* **In-Memory H2 Database**: Fast local development with automatic schema migration and embedded H2 Web Console.
* **Containerized Deployment**: Multi-stage Docker build ready for cloud container runtimes.

---

## 🛠️ Tech Stack

* **Backend Framework**: Java 17, Spring Boot 3.2.5
* **Web & Templating**: Spring Web, Thymeleaf
* **Persistence & ORM**: Spring Data JPA, Hibernate
* **Database**: In-memory H2 Database
* **Build Tool**: Apache Maven (Wrapper included)
* **DevOps & CI/CD**: Docker (Multi-stage), GitHub Actions

---

## 📋 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/` | Web Dashboard displaying student records |
| `GET` | `/api/students` | List all students (JSON) |
| `GET` | `/api/students/{id}` | Retrieve specific student by ID (JSON) |
| `POST` | `/api/students` | Register a new student (JSON payload) |
| `PUT` | `/api/students/{id}` | Update existing student profile |
| `DELETE` | `/api/students/{id}` | Delete student record |

---

## 💻 Quick Start & Running Locally

### 1. Prerequisites
* **Java 17+** (JDK)
* **Git**

### 2. Clone the Repository
```bash
git clone https://github.com/bharg6368vr/stud.git
cd stud
```

### 3. Run with Maven Wrapper
#### On Windows:
```cmd
mvnw.cmd spring-boot:run
```

#### On Linux / macOS:
```bash
chmod +x ./mvnw
./mvnw spring-boot:run
```

The application will start on: **`http://localhost:8186`**

### 4. Access H2 Database Console
* **URL**: `http://localhost:8186/h2`
* **JDBC URL**: `jdbc:h2:mem:testdb`
* **User**: `sa`
* **Password**: *(leave blank)*

---

## 🐳 Running with Docker

You can build and run the multi-stage Docker container locally:

```bash
# 1. Build the Docker image
docker build -t stud:latest .

# 2. Run the container
docker run -p 8186:8186 stud:latest
```

Open your browser at **`http://localhost:8186`**.
