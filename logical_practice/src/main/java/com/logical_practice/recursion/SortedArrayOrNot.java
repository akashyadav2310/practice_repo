package com.logical_practice.recursion;

// Check the given array is sorted or not using recursion 
public class SortedArrayOrNot {

	public static void main(String[] args) {
		int[] input = {1,3,5,6,8,9,10,11};
		System.out.print( isSorted(input, 0) );
	}
	
	static int i = 1;
	static boolean isSorted(int[] arr, int index) {
		if(index == arr.length - 1)
			return true;
			
		return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
	}
	
}
