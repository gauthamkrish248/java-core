package com.learning.core.day09;

import java.util.Scanner;

public class D09P03 {
	
	public void search(int arr[], int key) {
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				if(flag==true) {
					System.out.println("Element is Present");
					break;
				}	
			}
		}
		if(flag==true) {
			System.out.println("Element is not Present");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		D09P03 ls = new D09P03();
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements: ");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search: ");
		int key = sc.nextInt();
		ls.search(arr, key);
	}
}
