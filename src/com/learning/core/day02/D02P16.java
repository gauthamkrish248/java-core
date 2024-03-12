package com.learning.core.day02;
import java.util.Scanner;

public class D02P16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = scanner.nextInt();

        int a=0;
        int b=1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
