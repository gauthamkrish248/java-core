package com.learning.core.day02;
import java.util.Scanner;

public class D02P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int res=0;
		int digit = 0;
		while(n!=0) {
			digit = n%10;
			res = res*10 + digit;
			n = n/10;
		}
		System.out.println(res);
		
	}
}
