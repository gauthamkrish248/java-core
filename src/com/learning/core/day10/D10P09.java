package com.learning.core.day10;

public class D10P09 {
	public static void main(String[] args) {
		
	}
}

class Calculator3{
	public int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}