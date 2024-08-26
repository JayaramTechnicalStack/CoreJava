package com.org.list.arraylist;
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Add employees
        Employee e1 = new Employee(1, "John Doe", "Engineering", 60000);
        Employee e2 = new Employee(2, "Jane Smith", "HR", 55000);
        Employee e3 = new Employee(3, "Emily Johnson", "Marketing", 50000);
        
        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        // Display all employees
        System.out.println("All Employees:");
        manager.displayAllEmployees();

        // Update an employee
        manager.updateEmployee(2, "Jane Doe", "HR", 60000);

        // Display all employees after update
        System.out.println("After Update:");
        manager.displayAllEmployees();

        // Delete an employee
        manager.deleteEmployee(1);

        // Display all employees after deletion
        System.out.println("After Deletion:");
        manager.displayAllEmployees();
    }
}
