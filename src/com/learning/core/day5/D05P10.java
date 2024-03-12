package com.learning.core.day05;

import java.util.Scanner;
import java.util.TreeSet;

public class D05P10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Person> personSet = new TreeSet<>();
        System.out.println("Enter the number of Persons:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for person " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            personSet.add(new Person(id, name, age, salary));
        }

        for (Person person : personSet) {
            if (person.getName().toLowerCase().startsWith("j")) {
                System.out.println("First person whose name starts with 'j': " + person);
                break;
            }
        }
    }
}