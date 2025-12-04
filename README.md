# Learning Management System (LMS)

A comprehensive Learning Management System built with Java and MySQL, featuring a user-friendly Swing GUI interface.

## Project Overview
This LMS enables educational institutions to:
- Manage students, teachers, and courses
- Handle course enrollment and tracking
- Manage assignments with deadlines
- Generate performance reports
- Provide secure access to learning resources

## Features
- **User Management**: Student/Teacher/Admin registration and authentication
- **Course Management**: Create, edit, delete, and enroll in courses
- **Assignment Management**: Upload, submit, and track assignments
- **Resource Management**: Upload and access study materials
- **Reporting System**: Generate performance and submission reports
- **Admin Dashboard**: System management and statistics

## Tech Stack
- **Language**: Java
- **GUI**: Java Swing
- **Database**: MySQL
- **Architecture**: MVC Pattern
- **Security**: Password hashing with MD5

## System Requirements
- JDK 8 or higher
- MySQL Server 5.7 or higher
- RAM: 4 GB minimum
- Storage: 50 MB minimum

## Installation

### 1. Clone the Repository
```bash
git clone https://github.com/lmsapplication22/lms-project.git
cd lms-project
```

### 2. Database Setup
- Open MySQL
- Create database: `lms_db`
- Import database schema from `database/lms_schema.sql`

### 3. Configure Database Connection
Edit `src/main/resources/database.properties`:
```properties
db.driver=com.mysql.jdbc.Driver
db.url=jdbc:mysql://localhost:3306/lms_db
db.user=root
db.password=your_password
```

### 4. Compile and Run
```bash
javac -d bin src/main/java/com/lms/main/Main.java
java -cp bin com.lms.main.Main
```

## Project Structure
```
lms-project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/lms/
│   │   │       ├── main/
│   │   │       ├── model/
│   │   │       ├── view/
│   │   │       ├── controller/
│   │   │       ├── dao/
│   │   │       └── util/
│   │   └── resources/
│   │       └── database.properties
│   └── test/
├── database/
│   └── lms_schema.sql
├── lib/
└── README.md
```

## Default Login Credentials
- **Admin**: username: `admin`, password: `admin123`
- **Teacher**: username: `teacher1`, password: `teacher123`
- **Student**: username: `student1`, password: `student123`

## Usage
1. Launch the application
2. Login with appropriate credentials
3. Navigate through the menu based on your role
4. Perform operations as per your role (Student/Teacher/Admin)

## Contributing
Contributions are welcome! Please follow the coding standards and create a pull request with your changes.

## License
This project is licensed under the MIT License.

## Author
Developed for University Project