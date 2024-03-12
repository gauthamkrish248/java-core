package com.learning.core.day03;
import java.util.Scanner;

public class D03P13 {
	public static String replaceSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String result = replaceSpaces(input);

        System.out.println(result);
    }
}
