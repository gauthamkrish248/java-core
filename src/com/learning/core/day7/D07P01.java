package com.learning.core.day07;

class Stack {
	private int maxSize;
    String[] stackArray;
    int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String element) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + element);
            return;
        }
        stackArray[++top] = element;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        }
        return stackArray[top--];
    }
}

public class D07P01{
	public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push("Programming");
        stack.push("java");
        stack.push("world");
        stack.push("Hello");

        System.out.println("After Pushing 4 Elements:");
        for (int i = stack.top; i >= 0; i--) {
            System.out.print(stack.stackArray[i] + " ");
        }
        
        System.out.println();
        System.out.println("After Popping:");
        for (int i = stack.top; i >= 0; i--) {
            if (stack.stackArray[i].equals("Programming")) {
                stack.pop();
                break;
            }
            System.out.print(stack.pop() + " ");
        }
    }
}
