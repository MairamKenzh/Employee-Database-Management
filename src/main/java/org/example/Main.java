package org.example;

import java.text.SimpleDateFormat;
import java.util.List;

import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the EmployeeData object
        EmployeeData employeeData = new EmployeeData();

        // Create a new employee
        System.out.println("Creating a new employee...");
        int newEmployeeId = employeeData.createEmployee(
                "John Doe",
                "Software Engineer",
                75000.00,
                Date.valueOf("2023-12-01")
        );

        // Get and display all employees
        System.out.println("\nFetching all employees...");
        ArrayList<Employee> employees = employeeData.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Update the newly created employee
        if (newEmployeeId > 0) {
            System.out.println("\nUpdating the newly created employee...");
            employeeData.updateEmployee(
                    newEmployeeId,
                    "Anna Kay",
                    "Senior Software Engineer",
                    85000.00,
                    Date.valueOf("2023-12-01")
            );
        }

        // Fetch and display the updated employee by ID
        System.out.println("\nFetching employee by ID...");
        Employee updatedEmployee = employeeData.getEmployeeById(newEmployeeId);
        System.out.println(updatedEmployee);

        // Delete the employee
        if (newEmployeeId > 0) {
            System.out.println("\nDeleting the employee...");
            employeeData.deleteEmployee(newEmployeeId);
        }

        // Verify deletion by fetching all employees
        System.out.println("\nFetching all employees after deletion...");
        employees = employeeData.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
