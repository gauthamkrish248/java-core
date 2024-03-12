package com.learning.core.day03;
import java.util.Scanner;


public class D03P02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter numbers from 1 to 40:");
        for(int i=0;i<arr.length;i++) {
            int num = sc.nextInt();
            if (num < 1 || num > 40) {
                System.out.println("Enter numbers within the range!");
                i--; 
            } else {
                arr[i] = num;
            }
        }
        
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i]==num1 || arr[i]==num2) {
                count++;
            }
        }
        
        if(count == 2) {
            System.out.println("BINGO");
        } else {
            System.out.println("Not Found");
        }
    }
}
