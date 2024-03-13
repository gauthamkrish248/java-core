package com.learning.core.day08;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue2 {
    private Node front;
    private Node rear;
    
    public Queue2() {
        front = null;
        rear = null;
    }
    
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedItem = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return removedItem;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Elements in queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class D08P02 {
    public static void main(String[] args) {
        Queue2 queue = new Queue2();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);
        queue.printQueue();
        
        queue.dequeue();
        queue.dequeue();
        System.out.println("After removing two elements: ");
        queue.printQueue();
    }
}
