package com.learning.core.day03;

import java.util.Scanner;

public class D03P05 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter the elements");
	        for (int i = 0; i < size; i++) 
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter the value of K: ");
	        int k = sc.nextInt();
	        System.out.println("Distinct combinations are ");
	        printC(arr, k);
	        sc.close();
	    }

	    public static void printC(int[] arr, int k) 
	    {
	        int[] currentC = new int[k];
	        generateC(arr, k, 0, currentC, 0);
	    }
	    private static void generateC(int[] arr, int k, int start, int[] currentC, int currentI) 
	    {
	        if (currentI == k) {
	            for (int i = 0; i < k; i++) 
	            {
	                System.out.print(currentC[i] + " ");
	            }
	            System.out.println();
	            return;
	        }

	        for (int i = start; i < arr.length; i++) 
	        {
	            currentC[currentI] = arr[i];
	            generateC(arr, k, i + 1, currentC, currentI + 1);
	        }
	    }
	}