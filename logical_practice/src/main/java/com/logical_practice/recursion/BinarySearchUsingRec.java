package com.logical_practice.recursion;

public class BinarySearchUsingRec {

	public static void main(String[] args) {
		int[] input = {2, 4, 6, 7, 9, 21, 33, 37, 49, 50};
		int target = 51;
		int start = 0;
		int end = input.length - 1;
		System.out.println(binarySearch(input, target, start, end));
	}

	static int binarySearch(int[] arr, int target, int s, int e) {
		
		if(s > e)
			return -1;
		
		int mid = s + (e - s) / 2;
		if(arr[mid] == target)
			return mid;
		
		if(target < arr[mid])
			return binarySearch(arr, target, s, mid - 1);
		
		return binarySearch(arr, target, mid + 1, e);
		
	}
	
}
