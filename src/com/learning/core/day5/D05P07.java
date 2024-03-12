package com.learning.core.day05;
import java.util.Scanner;
import java.util.TreeSet;

public class D05P07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Person> persons = new TreeSet<>();
        
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
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            persons.add(new Person(id, name, 0, salary));
        }

        scanner.close();

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
