package com.learning.core.day03;
import java.util.Scanner;

public class D03P12 {
	
	public static boolean canSplitIntoFourDistinctStrings(String s) {
        if (s.length() < 4) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    String first = s.substring(0, i);
                    String second = s.substring(i, j);
                    String third = s.substring(j, k);
                    String fourth = s.substring(k);
                    if (!first.equals(second) && !first.equals(third) && !first.equals(fourth) &&
                            !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        boolean result = canSplitIntoFourDistinctStrings(input);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
