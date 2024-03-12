package com.learning.core.day07;

import java.util.Scanner;
import java.util.Stack;

public class D07P07 {
	public static boolean isTopElementEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int topElement = stack.peek();
        return topElement % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter space-separated elements to push onto the stack: ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            stack.push(Integer.parseInt(element));
        }

        boolean isEven = isTopElementEven(stack);
        System.out.println(isEven);

        scanner.close();
    }
}
