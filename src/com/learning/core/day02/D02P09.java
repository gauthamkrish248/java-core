package com.learning.core.day02;

import java.util.Scanner;

public class D02P09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int cube = 0;
		for(int i=1;i<=n;i++) {
			cube = i*i*i;
			System.out.println(cube);
		}
	}
}
