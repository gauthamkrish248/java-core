package com.learning.core.day10;

import java.io.*;

public class D10P01 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java D10P01 <source_file> <destination_file>");
            return;
        }

        String sourcePath = args[0];
        String destinationPath = args[1];

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
