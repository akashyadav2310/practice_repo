package com.logical_practice.recursion;

// Check the given array is sorted or not using recursion 
public class SortedArrayOrNot {

	public static void main(String[] args) {
		int[] input = {1,3,5,6,8,9,10};
		boolean ans = isSorted(input);

	}
	
	static int i = 1;
	static boolean isSorted(int[] arr) {
		if( arr[i - 1] > arr[i]);
			return false;
		else 
			return isSorted(arr);
			
		return isSorted(arr);
	}
	
}
