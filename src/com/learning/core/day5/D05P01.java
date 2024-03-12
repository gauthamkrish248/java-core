package com.learning.core.day05;

import java.util.Scanner;

public class D05P01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();

        System.out.println("Enter user type (1 for Employee, 2 for Student):");
        int userType = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        if (userType == 1) {
            System.out.println("Enter employee details (Name PhoneNo EmployeeId PassportNo):");
            String[] employeeDetails = scanner.nextLine().split(" ");
            Employee employee;
            if (employeeDetails.length == 4) {
                employee = new Employee(employeeDetails[0], Long.parseLong(employeeDetails[1]),
                                        Integer.parseInt(employeeDetails[2]), employeeDetails[3]);
            } else if (employeeDetails.length == 5) {
                employee = new Employee(employeeDetails[0], Long.parseLong(employeeDetails[1]),
                                        Integer.parseInt(employeeDetails[2]), Integer.parseInt(employeeDetails[3]),
                                        employeeDetails[4]);
            } else {
                employee = new Employee(employeeDetails[0], Long.parseLong(employeeDetails[1]),
                                        Integer.parseInt(employeeDetails[2]), Integer.parseInt(employeeDetails[3]),
                                        employeeDetails[4], Integer.parseInt(employeeDetails[5]));
            }
            String registerId = register.generateRegisterId(7);
            register.display(employee, registerId);
        } else if (userType == 2) {
            System.out.println("Enter student details (Name PhoneNo PassportNo/VoterId LicenseNo/PanCardNo):");
            String[] studentDetails = scanner.nextLine().split(" ");
            Student student;
            if (studentDetails.length == 3) {
                student = new Student(studentDetails[0], Long.parseLong(studentDetails[1]), studentDetails[2]);
            } else if (studentDetails.length == 4) {
                student = new Student(studentDetails[0], Long.parseLong(studentDetails[1]), 
                                      Integer.parseInt(studentDetails[2]), studentDetails[3]);
            } else {
                student = new Student(studentDetails[0], Long.parseLong(studentDetails[1]), 
                                      Integer.parseInt(studentDetails[2]), Integer.parseInt(studentDetails[3]));
            }
            String registerId = register.generateRegisterId(7);
            register.display(student, registerId);
        } else {
            System.out.println("Invalid user type.");
        }
        scanner.close();
    }
}
