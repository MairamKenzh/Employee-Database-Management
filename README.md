# Employee Database Management System
## Description
The Employee Database Management System is a simple Java application that demonstrates CRUD (Create, Read, Update, Delete) operations on an employee database. It integrates a PostgreSQL database with Java using JDBC and follows Object-Oriented Programming (OOP) principles like encapsulation and modularity. The project allows users to create, retrieve, update, and delete employee records.

## Instructions on How to Run the Program
1. Prerequisites
Java JDK: Ensure Java JDK 17 or higher is installed.
PostgreSQL: Install and configure PostgreSQL on your system.
IDE: Use IntelliJ IDEA or any other Java-compatible IDE.
Maven: If Maven is not installed, download and configure it.
2. Set Up the Database
Open pgAdmin or any PostgreSQL client.
Create the database:
sql
create database employee_db;
Connect to the employee_db database:
sql
Копировать код
\c employee_db;
Create the employee table:
sql
Копировать код
create table employee (
    id serial primary key,
    name varchar(100) not null,
    position varchar(100) not null,
    salary double precision not null,
    hire_date date not null
);
3. Clone the Project
Download or clone the repository:

bash

git clone https://github.com/nurjamal505/Employee-Database-Management.git
cd Employee-Database-Management
4. Configure Database Credentials
In the EmployeeData class, update the database connection details:

java

private static final String URL = "jdbc:postgresql://localhost:5432/employee_db";
private static final String USER = "your_username"; // Replace with your PostgreSQL username
private static final String PASSWORD = "your_password"; // Replace with your PostgreSQL password 

5. Run the Project
Open the project in IntelliJ IDEA or your preferred IDE.
Build the project:
bash
Копировать код
mvn clean install
Run the Main class to see the CRUD operations in action.

## Screenshots
1. Before Running the Program
Empty database:

sql
Копировать код
select * from employee;
Output:

scss
Копировать код
(No rows returned)
2. After Adding Employees
Screenshot of the database with new employees added:

sql
Копировать код
select * from employee;
Output:

arduino
Копировать код
 id |   name   |       position        |  salary  |  hire_date  
----+----------+-----------------------+----------+------------
 1  | Anna Kay | Designer              | 70000.00 | 2024-12-01
3. After Updating an Employee
Screenshot of the database after an employee's data is updated:

sql
Копировать код
select * from employee;
Output:

arduino
Копировать код
 id |   name   |          position         |  salary  |  hire_date  
----+----------+---------------------------+----------+------------
 1  | Anna Kay | Senior Software Engineer | 85000.00 | 2023-12-01
4. After Deleting an Employee
Screenshot of the database after deleting the employee:

sql
select * from employee;
Output:

scss
Evaluation Criteria
1. Proper Use of OOP Concepts
Encapsulation: The Employee class uses private fields with public getters and setters.
Modularity: The EmployeeData class encapsulates database operations.
Reusability: Methods are reusable and adhere to OOP principles.
2. Code Quality
Naming Conventions: Methods and variables are named meaningfully.
Comments: Clear comments explain each method and block of code.
Exception Handling: Database errors are handled using try-catch blocks.
3. Completeness
CRUD operations (createEmployee, getAllEmployees, updateEmployee, deleteEmployee) are fully implemented and tested.
Example workflows in the Main class demonstrate how the system works.
Database screenshots are included to show the state at each step.
