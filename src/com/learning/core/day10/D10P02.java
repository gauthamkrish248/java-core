package com.learning.core.day10;

import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    private int rollNumber;
    private String name;
    private int age;
    private String address;

    public Student(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class D10P02 {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean writeToDisk = false;
            ObjectOutputStream objectOutputStream = null;

            System.out.println("Enter Roll Number:");
            int rollNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Age:");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Address:");
            String address = scanner.nextLine();

            if (name.isBlank() || address.isBlank()) {
                throw new CustomException("Name and Address cannot be blank");
            }

            Student student = new Student(rollNumber, name, age, address);

            System.out.println("Do you want to write data to file? (Yes/No):");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                writeToDisk = true;
            }

            if (writeToDisk) {
                try {
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream("students.ser"));
                    objectOutputStream.writeObject(student);
                    System.out.println("Student data written to file successfully.");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                } finally {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e) {
                            System.out.println("Error closing file: " + e.getMessage());
                        }
                    }
                }
            } else {
                System.out.println("Program terminated without writing to file.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Roll Number and Age should be numeric.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
