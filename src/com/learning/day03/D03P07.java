package com.learning.core.day03;
import java.util.Scanner;

public class D03P07 {

    public static void printSubsequences(String str) {
        printSubsequencesHelper(str, "");
    }

    private static void printSubsequencesHelper(String str, String current) {
        if (str.length() == 0) {
            System.out.print(current + ",");
            return;
        }

        printSubsequencesHelper(str.substring(1), current + str.charAt(0));

        printSubsequencesHelper(str.substring(1), current);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        System.out.println("All subsequences of '" + input + "':");
        printSubsequences(input);
    }
}
