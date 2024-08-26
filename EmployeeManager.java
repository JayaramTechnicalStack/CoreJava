package com.org.list.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
	
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Add a new employee
    public void addEmployee(Employee employee) { // Employee employee = e1;
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

    // Read (display) all employees
    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Update an employee's details
    public void updateEmployee(int id, String name, String department, double salary) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("Employee updated: " + employee);
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }

    // Delete an employee by ID
    public void deleteEmployee(int id) {
     Iterator<Employee> iterator = employees.iterator();
     
     while(iterator.hasNext()) {
    	 Employee emp = iterator.next();
    	 if(emp.getId() == id) {
    		 iterator.remove();
    		 System.out.println("Employee deleted with id :"+id) ;
    		 return;
    	 }
     }
     System.out.println("Employee not found with ID: " + id);
    }
}
