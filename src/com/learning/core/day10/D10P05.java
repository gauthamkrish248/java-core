package com.learning.core.day10;

import java.io.*;
import java.util.Scanner;

public class D10P05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step a: Write the String input in the file io.txt
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        writeToFile(input);

        // Step b: Show size of the file
        long fileSize = getFileSize();
        System.out.println("Size of the file io.txt: " + fileSize + " bytes");

        // Step c: Read contents from the file and display them on console
        System.out.println("Contents of the file io.txt:");
        readAndDisplayFileContents();

        // Step d: Delete io.txt file using File class
        deleteFile();

        scanner.close();
    }

    private static void writeToFile(String input) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("io.txt"))) {
            writer.println(input);
            System.out.println("String written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static long getFileSize() {
        File file = new File("io.txt");
        return file.length();
    }

    private static void readAndDisplayFileContents() {
        try (BufferedReader reader = new BufferedReader(new FileReader("io.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void deleteFile() {
        File file = new File("io.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File io.txt deleted successfully.");
            } else {
                System.out.println("Failed to delete file io.txt.");
            }
        } else {
            System.out.println("File io.txt does not exist.");
        }
    }
}
