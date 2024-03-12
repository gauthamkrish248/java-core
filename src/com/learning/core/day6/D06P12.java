package com.learning.core.day06;

import java.util.*;

public class D06P12 {
	public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        Employee employee1 = new Employee(1001, "Daniel", "Analyst", "L&D");
        Employee employee2 = new Employee(1002, "Thomas", "Tester", "Testing");
        Employee employee3 = new Employee(1003, "Robert", "Product Manager", "Development");
        Employee employee4 = new Employee(1004, "Grace", "Tech Support", "HR");
        Employee employee5 = new Employee(1005, "Charles", "QA Lead", "Testing");
        Employee employee6 = new Employee(1006, "Henry", "Accountant", "Finance");

        employeeTable.put(employee1.getId(), employee1);
        employeeTable.put(employee2.getId(), employee2);
        employeeTable.put(employee3.getId(), employee3);
        employeeTable.put(employee4.getId(), employee4);
        employeeTable.put(employee5.getId(), employee5);
        employeeTable.put(employee6.getId(), employee6);

        System.out.println("Hashtable before adding new employees:");
        for (Map.Entry<Integer, Employee> entry : employeeTable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        addEmployeeIfNotExists(employeeTable, new Employee(1007, "David", "Assistant", "HR"));
        addEmployeeIfNotExists(employeeTable, new Employee(1002, "Alice", "Analyst", "Finance")); // Already exists
        addEmployeeIfNotExists(employeeTable, new Employee(1006, "Grace", "Programmer", "IT"));

        System.out.println("\nHashtable after adding new employees:");
        for (Map.Entry<Integer, Employee> entry : employeeTable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void addEmployeeIfNotExists(Hashtable<Integer, Employee> employeeTable, Employee employee) {
        if (!employeeTable.containsKey(employee.id)) {
            employeeTable.put(employee.id, employee);
            System.out.println("Added new employee: " + employee);
        } else {
            System.out.println("Employee already exists: " + employee);
        }
    }
}
