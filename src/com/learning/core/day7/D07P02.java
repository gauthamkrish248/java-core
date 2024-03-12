package com.learning.core.day07;


import java.util.Scanner;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Double.NaN; 
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}


public class D07P02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackLinkedList stack = new StackLinkedList();

        System.out.println("Enter space-separated elements to push onto the stack: ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            double data = Double.parseDouble(element);
            stack.push(data);
        }

        stack.display();

        System.out.println("After popping twice:");
        stack.pop();
        stack.pop();
        stack.display();

        scanner.close();
    }
}