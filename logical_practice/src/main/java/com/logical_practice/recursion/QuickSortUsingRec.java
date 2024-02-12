package com.logical_practice.recursion;

import java.util.Arrays;

public class QuickSortUsingRec {

	public static void main(String[] args) {
		int[] arr = {6, 5, 7, 1, 9, 2, 8, 4, 3};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void quickSort(int[] arr, int low, int high) {
		if(low > high)
			return;
		
		int start = low;
		int end = high;
		int mid = start + (end - start) / 2;
		
		int pivot = arr[mid];
		
		while(start <= end ) {
			
			while(arr[start] < pivot) {
				start++;
			}
			
			while(arr[end] > pivot) {
				end--;
			}
		
			if(start <= end) {
				int temp = arr[start];
				arr[start]  = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			
			quickSort(arr, low, end);
			quickSort(arr, start, high);
		}
	}
	
}
