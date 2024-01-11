package com.dsa.sort;

import java.util.Arrays;

public class CyclicSorting {

	public static void main(String[] args) {
		int[] arr = {3, 2, 5, 1, 4};  // Range of array is 1-N
		int[] sortedArray = cyclicSort(arr);
		System.out.println(Arrays.toString(sortedArray));
	}

	static int[] cyclicSort(int[] arr) {		
		int i = 0;
		while(i < arr.length) {
			int correctIndex = arr[i] - 1;
			if(arr[i] != arr[correctIndex]) {
				// Swap the index i to the CorrectIndex
				int temp = arr[i];
				arr[i] = arr[correctIndex];
				arr[correctIndex] = temp;
			}else {
				// If the 'i' index is in the correct position, increment the index.
				i++;
			}
		}		
		return arr;
	}
	
}
