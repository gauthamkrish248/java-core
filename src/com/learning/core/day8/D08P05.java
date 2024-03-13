package com.learning.core.day08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter elements of the queue (separated by spaces):");
        String input = scanner.nextLine().trim();
        String[] elements = input.split("\\s+");

        for (String element : elements) {
            queue.offer(Integer.parseInt(element));
        }

        Queue<Integer>[] result = splitQueue(queue);

        System.out.print("Odd Queue: ");
        printQueue(result[0]);
        System.out.print("Even Queue: ");
        printQueue(result[1]);

        scanner.close();
    }

    public static Queue<Integer>[] splitQueue(Queue<Integer> queue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num % 2 == 0) {
                evenQueue.offer(num);
            } else {
                oddQueue.offer(num);
            }
        }

        Queue<Integer>[] result = new Queue[2];
        result[0] = oddQueue;
        result[1] = evenQueue;

        return result;
    }

    public static void printQueue(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}
