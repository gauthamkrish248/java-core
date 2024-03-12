package com.learning.core.day02;
import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter N: ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}
		
	}
}
