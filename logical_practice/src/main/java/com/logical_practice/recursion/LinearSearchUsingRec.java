package com.logical_practice.recursion;

public class LinearSearchUsingRec {

	public static void main(String[] args) {
		int[] input = {2, 4, 6, 7, 9, 21, 33, 37, 49, 50};
		int target = 51;
		//System.out.println(linearSearch(input, target, 0)); // '0' is a starting index
		System.out.println(linearSearchIndex(input, target, 0)); // '0' is a starting index
	}

	// Check the element is present in the given array and return true or false
	static boolean linearSearch(int[] arr, int target, int index) {
		if(index == arr.length)
			return false; // return false because index is exceeded the array length
		
		return arr[index] == target || linearSearch(arr, target, index + 1);
	}
	
	// Check the element is present in the given array and return the index of the element
	static int linearSearchIndex(int[] arr, int target, int index) {
		if(index == arr.length)
			return -1; // return -1 because index is exceeded the array length means element is not found
		
		if(arr[index] == target)
			return index;
		else
			return linearSearchIndex(arr, target, index + 1);
	}
	
}
