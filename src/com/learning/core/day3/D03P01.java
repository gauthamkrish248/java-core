package com.learning.core.day03;
import java.util.Scanner;


public class D03P01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("Length of the string: " + input.length());
        
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        String reverse = "";
        for(int i=(input.length()-1);i>=0;--i) {
        	reverse = reverse + input.charAt(i);
        }
        if (input.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("It is a Palindrome String.");
          }
          else {
            System.out.println("It is not a Palindrome String.");
          }
	}
}
