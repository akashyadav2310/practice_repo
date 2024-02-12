package com.logical_practice.recursion;

import java.util.Arrays;

public class SelectionSortUsingRec {

	public static void main(String[] args) {
		int[] input = {60, 25, 10, 50, 75, 70, 30, 20, 40, 90, 80};
		//int[] input = {10, 20, 40, 30, 50};
		int[] ans = selectionSort(input, input.length);
		System.out.println(Arrays.toString(ans));
	}

	static int[] selectionSort(int[] arr, int n) {
		
		// Base condition
		if(n == 1) // Means array at the first index so we did not need to check the elements now
			return arr;
		
		int lastIndex = n - 1; // set last Index to n (length of the array) - 1. 
							   // Because every pass it finds max element and swap its to their appropriate index
		int maxIndex = getMaxIndex(arr, 0 ,lastIndex); // To finds a max element for every pass
		
		// Swaps Max Element to their appropriate index
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[lastIndex];
		arr[lastIndex] = temp;
		
		return selectionSort(arr, n - 1);
	}
	
	// finds a max Index
	static int getMaxIndex(int[] arr, int start, int last) {
		int maxIndex = start;
	
		for(int i = start + 1; i <= last; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}


//System.out.println("MI Function Array : " + Arrays.toString(arr));
//System.out.println("MI Start : " + start + " Last : " + last );
//System.out.println("MI before : " + maxIndex );
//
//System.out.println("arr[i + 1] " + arr[i + 1] + " arr[maxIndex] : " + arr[maxIndex] );
//
//System.out.println("MI Max Element : " +arr[maxIndex]);
