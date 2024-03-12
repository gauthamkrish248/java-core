package com.learning.core.day07;

import java.util.Scanner;
import java.util.Stack;

public class D07P06 {
	public static int findMinElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Create a temporary stack to hold the elements
        Stack<Integer> tempStack = new Stack<>();
        int minElement = stack.peek();

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current < minElement) {
                minElement = current;
            }
            tempStack.push(current);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return minElement;
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

        int minElement = findMinElement(stack);
        System.out.println("Minimum element in the stack: " + minElement);

        scanner.close();
    }
}
