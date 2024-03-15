package com.learning.core.day10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class D10P03 {
	public static void main(String[] args) {
        List<Student> students = readRecordsFromFile();
        if (students != null) {
            System.out.println("Records saved in the file:");
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("No records found in the file.");
        }
    }

    private static List<Student> readRecordsFromFile() {
        List<Student> students = new ArrayList<>();
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("students.ser"));
            while (true) {
                Student student = (Student) objectInputStream.readObject();
                students.add(student);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
        return students;
    }
}
