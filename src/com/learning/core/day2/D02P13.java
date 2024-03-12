package com.learning.core.day02;
import java.util.Scanner;

public class D02P13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int fact = 1;
		for(int i = 1;i<n+1;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
