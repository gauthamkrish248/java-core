package com.learning.core.day02;
import java.util.Scanner;

public class D02P04 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b && a>c ) {
			System.out.println(a+" is the greatest of the given numbers");
		}
		else if(b>a && b>c ) {
			System.out.println(b+" is the greatest of the given numbers");
		}
		else
			System.out.println(c+" is the greatest of the given numbers");
	}
		
}
