package com.dsa.sort;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] arr = {20, 30, 10, 50, 40};
		//int[] arr = {10, 30, 20, 10, 30, 40, 10, 50, 60};
		int[] sortedArray = selectionSort(arr);
		System.out.println(Arrays.toString(sortedArray));
	}

	static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// Find the max item in the remaining array and swap with correct index
			int lastIndex = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0 , lastIndex);
			// Swap the max element to the last of the unsorted array means (last = arr.length - i - 1)
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
		}
		return arr;
	}

	static int getMaxIndex(int[] arr, int startIndex, int endIndex) {
		int max = startIndex;
		for (int i = startIndex; i <= endIndex; i++) {
			if(arr[max] < arr[i])
				max = i;
		}
		return max;
	}
}
