package com.learning.core.day08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.println("Enter elements of the queue (separated by spaces or enter '[]' for an empty queue):");
        String input = scanner.nextLine().trim();

        if (input.equals("[]")) {
            System.out.println("Empty");
        } else {
            String[] elements = input.split("\\s+");
            for (String element : elements) {
                queue.offer(element);
            }
            if (queue.isEmpty()) {
                System.out.println("Empty");
            } else {
                System.out.println("Not Empty");
            }
        }
        scanner.close();
    }
}