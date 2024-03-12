package com.learning.core.day02;
import java.util.Scanner;

public class D02P05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if(a%5==0) {
			System.out.println("Number is divisible by 5");
		}
		else
			System.out.println("Number is not divisible by 5");
	}
}
