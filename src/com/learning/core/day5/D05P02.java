package com.learning.core.day05;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();

        System.out.println("Enter student names:");

        String inputName;
        while (true) {
            inputName = scanner.nextLine();
            if (inputName.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(inputName);
        }

        System.out.println("Enter the name to search for:");
        String nameToFind = scanner.nextLine();

        if (studentNames.contains(nameToFind)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

