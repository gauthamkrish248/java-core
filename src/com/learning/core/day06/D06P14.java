package com.learning.core.day06;

import java.util.*;

public class D06P14 {
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

        Hashtable<Integer, Employee> anotherEmployeeTable = new Hashtable<>();
        anotherEmployeeTable.put(2001, new Employee(2001, "Mike", "Representative", "Sales"));
        anotherEmployeeTable.put(2002, new Employee(2002, "Sara", "Supervisor", "Operations"));

        addEmployees(employeeTable, anotherEmployeeTable);

        System.out.println("EmployeeTable after adding employees:");
        for (Map.Entry<Integer, Employee> entry : employeeTable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void addEmployees(Hashtable<Integer, Employee> dest, Hashtable<Integer, Employee> src) {
        dest.putAll(src);
    }
}
