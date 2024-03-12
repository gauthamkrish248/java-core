package com.learning.core.day02;
import java.util.Scanner;

public class D02P11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number: ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
