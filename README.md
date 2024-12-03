Employee Database Management System
Project Description
This Java application interacts with a PostgreSQL database to manage employee data using JDBC. It implements CRUD (Create, Read, Update, Delete) operations on an employee table. The application consists of two main classes:

Employee: Represents an employee entity.
EmployeeData: Handles database operations using JDBC.
The program adheres to Object-Oriented Programming (OOP) principles, ensuring modularity and encapsulation.

Requirements
Database Setup
Create a database named employee_db in PostgreSQL.
Create the employee table by running the following SQL script:
sql
Копировать код
create table employee (
    id serial primary key,
    name varchar(100) not null,
    position varchar(100) not null,
    salary double precision not null,
    hire_date date not null
);
Employee Class
The Employee class contains the following fields:

id (int): Unique identifier for each employee.
name (String): Name of the employee.
position (String): Job title of the employee.
salary (double): Salary of the employee.
hireDate (Date): Date the employee was hired.
The class includes:

Constructors for creating Employee objects.
Getters and setters for all fields.
A toString() method for easy display of employee information.
EmployeeData Class
This class handles database interactions using JDBC. Key methods include:

createEmployee: Adds a new employee to the database.
java
Копировать код
int createEmployee(String name, String position, double salary, Date hireDate)
getAllEmployees: Retrieves all employees from the database.
java
Копировать код
ArrayList<Employee> getAllEmployees()
getEmployeeById: Fetches a single employee by their ID.
java
Копировать код
Employee getEmployeeById(int id)
updateEmployee: Updates an employee's details.
java
Копировать код
void updateEmployee(int id, String name, String position, double salary, Date hireDate)
deleteEmployee: Deletes an employee from the database by their ID.
java
Копировать код
void deleteEmployee(int id)
How to Run the Program
Clone or download the project:
bash
Копировать код
git clone https://github.com/nurjamal505/Employee-Database-Management.git
cd Employee-Database-Management
Open the project in IntelliJ IDEA or another IDE.
Update the database credentials in EmployeeData:
java
Копировать код
String url = "jdbc:postgresql://localhost:5432/employee_db";
String username = "your_username";
String password = "your_password";
Run the Main class.
Example Workflow
The Main class demonstrates the following:
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

View all employees:
java
Копировать код
ArrayList<Employee> employees = employeeData.getAllEmployees();
for (Employee emp : employees) {
    System.out.println(emp);
}
Update an employee:
java
Копировать код
employeeData.updateEmployee(
    newEmployeeId, "Anna Kay", "Senior Designer", 85000.00, Date.valueOf("2023-12-01")
);
Delete an employee:
java
Копировать код
employeeData.deleteEmployee(newEmployeeId);
Expected Output
After Adding an Employee:
arduino
Копировать код
Employee{id=1, name='Anna Kay', position='Designer', salary=70000.0, hireDate=2024-12-01}
After Updating the Employee:
arduino
Копировать код
Employee{id=1, name='Anna Kay', position='Senior Designer', salary=85000.0, hireDate=2023-12-01}
After Deletion:
csharp
Копировать код
(No records found, the table is empty.)
Evaluation Criteria
OOP Principles: Proper encapsulation, modularity, and code organization.
Code Quality: Readable and maintainable code with clear comments and exception handling.
Completeness: Includes all CRUD operations and a working Main class for testing.
GitHub Repository:
Structured project with a README file.
Includes example workflows and expected output.
