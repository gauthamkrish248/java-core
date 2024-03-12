package com.learning.core.day02;
import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		char ch;
		System.out.println("Enter numbers and operation: ");
		a = sc.nextInt();
		b = sc.nextInt();
		ch = sc.next().charAt(0);
		int res = 0;
		switch(ch) {
		case('+'):
			res = a+b;
			break;
		case('-'):
			res = a-b;
			break;
		case('*'):
			res = a*b;
			break;
		case('/'):
			if(b==0) {
				System.out.println("Cannot divide by zero");
				return;
			}
			else 
				res = a/b;
			break;
		default:
			System.out.println("Enter a valid operator");
		}
		System.out.println(res);
		
	}
}
