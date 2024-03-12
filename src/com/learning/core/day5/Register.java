package com.learning.core.day05;

import java.util.Random;

class Register<T> {
    private String registerId;

    public String generateRegisterId(int n) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public void display(T user, String registerId) {
        if (user instanceof Employee) {
            Employee employee = (Employee) user;
            System.out.println(registerId + " " + employee.name + " " + employee.phoneNo + " " +
                    employee.employeeId + " " + employee.passportNo);
        } else if (user instanceof Student) {
            Student student = (Student) user;
            System.out.println(registerId + " " + student.name + " " + student.phoneNo + " " +
                    student.passportNo);
        }
    }
}
