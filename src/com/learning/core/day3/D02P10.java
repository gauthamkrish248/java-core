package com.learning.core.day03;
import java.util.Scanner;

public class D02P10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        int result = longestPrefixSuffixLength(s);

        System.out.println(result);
    }

    public static int longestPrefixSuffixLength(String s) {
        int n = s.length();
        int len = 0; 

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
            } else {
                len = 0;
            }
        }

        return len;
    }
}
