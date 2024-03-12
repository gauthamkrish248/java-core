package com.learning.core.day02;
import java.util.Scanner;

public class D02P14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long result = calculatePower(a, b);
        System.out.println(result);
    }

    static long calculatePower(int a, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
	}
}