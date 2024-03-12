package com.learning.core.day06;

import java.util.*;

class Employee {
    int id;
    private String name;
    private String designation;
    private String department;
    

    public Employee(int id, String name, String designation, String department) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
        
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P10 {
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

        System.out.println(employeeTable.isEmpty());
    }
}

