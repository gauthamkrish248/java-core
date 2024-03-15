package com.learning.core.day10;

import java.io.*;

public class D10P06 {
	public static void main(String[] args) {
        mergeNotesForYear("DavidEnglish.txt", "DavidScience.txt", "DavidComputer.txt", "DavidNotes.txt");
    }

    public static void mergeNotesForYear(String englishFile, String scienceFile, String computerFile, String mergedFile) {
        try (BufferedReader englishReader = new BufferedReader(new FileReader(englishFile));
             BufferedReader scienceReader = new BufferedReader(new FileReader(scienceFile));
             BufferedReader computerReader = new BufferedReader(new FileReader(computerFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {

            writer.write("Semester 1 English Notes:\n");
            writer.write("--------------------------\n");
            String line;
            while ((line = englishReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.newLine();

            writer.write("Semester 1 Science Notes:\n");
            writer.write("--------------------------\n");
            while ((line = scienceReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.newLine();

            writer.write("Semester 2 Computer Notes:\n");
            writer.write("--------------------------\n");
            while ((line = computerReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.newLine();

            System.out.println("Notes for David merged successfully.");
        } catch (IOException e) {
            System.out.println("Error merging notes: " + e.getMessage());
        }
    }
}
