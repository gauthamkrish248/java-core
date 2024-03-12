package com.learning.core.day07;

import java.util.Scanner;
import java.util.Stack;

public class D07P05 {
	public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
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

        System.out.println("Before Reversing:");
        System.out.println(stack);

        reverseStack(stack);

        System.out.println("After Reversing:");
        System.out.println(stack);

        scanner.close();
    }
}
