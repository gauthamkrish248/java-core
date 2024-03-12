package com.learning.core.day03;
import java.util.Scanner;

public class D03P06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the number of vowels to count from the end:");
        int n = scanner.nextInt();

        int vowelCount = 0;
        int count = 0;

        StringBuilder lastNVowels = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                lastNVowels.insert(0, ch);
                if (count == n) {
                    break;
                }
            }
        }

        if (count < n) {
            System.out.println("Mismatch in vowel count");
        } else {
            System.out.println("Last " + n + " vowels from the end: " + lastNVowels);
        }
    }
}
