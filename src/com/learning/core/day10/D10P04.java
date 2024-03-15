package com.learning.core.day10;

import java.io.*;
import java.nio.file.*;

public class D10P04 {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopyUsingFileSystem <source_file> <destination_file>");
            return;
        }

        String sourcePath = args[0];
        String destinationPath = args[1];

        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destinationPath);

        try {
            // Copy the contents of the source file to the destination file
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
