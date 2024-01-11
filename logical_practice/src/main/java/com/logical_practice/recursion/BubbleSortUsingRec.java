package com.logical_practice.recursion;

import java.util.Arrays;

//https://www.geeksforgeeks.org/recursive-bubble-sort/
public class BubbleSortUsingRec {

	public static void main(String[] args) {
		int[] input = {60, 10, 50, 70, 30, 20, 40};
		//int[] input = {10, 20, 40, 30, 50};
		int[] ans = bubbleSort(input, input.length);
		System.out.print(Arrays.toString(ans));
	}

	static int[] bubbleSort(int[] input, int n) {
		
		// Base condition
		if(n == 1)
			return input;

		boolean swapped = false; // Set false first
		for (int j = 1; j <= n - 1; j++) {
			if(input[j] < input[j - 1]) {
				int temp = input[j];
				input[j] = input[j - 1];
				input[j - 1] = temp;
				swapped = true;
			}	
		}
		// Check if any recursion happens or not 
	    // If any recursion is not happen then return 
		// Means the given array at that n (Size) is already sorted
		if(!swapped)
			return input;
		
		return bubbleSort(input, n - 1);
	}
}
