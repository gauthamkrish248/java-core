package com.learning.core.day06;

import java.util.HashMap;
import java.util.Scanner;

public class D06P02 {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name to search for phone number: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            String phoneNumber = phoneBook.get(name);
            System.out.println("Phone number of " + name + " is: " + phoneNumber);
        } else {
            System.out.println("No entry found for " + name + " in the phone book.");
        }
    }
}
