package com.dsa.sort;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		int[] arr = {20, 30, 10, 50, 40};
		//int[] arr = {10, 30, 20, 10, 30, 40, 10, 50, 60};
		int[] sortedArray = insertionSort(arr);
		System.out.println(Arrays.toString(sortedArray));
	}

	static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if(arr[j] < arr[j - 1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				else {
					break;
				}	
			}
		}
		return arr;
	}
	
}
