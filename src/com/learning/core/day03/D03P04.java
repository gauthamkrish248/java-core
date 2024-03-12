package com.learning.core.day03;
import java.util.Scanner;

public class D03P04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt(); 
        int[] arr = new int[n]; 

        for (int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        int result = -1;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) {
                    result = arr[i];
                    break;
                }
            }
            if (result != -1) {
                break;
            }
        }
        System.out.println("First Repeated Element: ");
        System.out.println(result);
    }
}
