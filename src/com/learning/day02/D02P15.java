package com.learning.core.day02;
import java.util.Scanner;

public class D02P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int positive=0,negative=0,zeroes=0;
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
				if(num>0)
					positive++;
				else if(num<0)
					negative++;
				else
					zeroes++;
			
		}
		System.out.println("Positive: "+positive);
		System.out.println("Negative: "+negative);
		System.out.println("Zeroes: "+zeroes);
		
	}
}