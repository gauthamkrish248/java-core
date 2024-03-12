package com.learning.core.day02;
import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int percentage;
		System.out.println("Enter Percentage: ");
		percentage = sc.nextInt();
		if(percentage>=60)
			System.out.println("A Grade");
		else if(percentage>=45)
			System.out.println("B Grade");
		else if(percentage>=35)
			System.out.println("c Grade");
		else
			System.out.println("Fail");
	}
}
