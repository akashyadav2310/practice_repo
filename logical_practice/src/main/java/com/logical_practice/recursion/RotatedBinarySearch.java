package com.logical_practice.recursion;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] input = {5, 6, 7, 9, 1, 2, 3, 4};
		int target = 9 ;
		System.out.print(binarySearch(input, target, 0, input.length - 1));
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		if(start > end )
			return -1; // If start > end index that means element not found so we return -1
		
		int mid = start + (end - start) / 2;
		
		if(arr[mid] == target)
			return mid;
		
		if(arr[start] <= arr[mid]) {
			if(target >= arr[start] && target <= arr[mid])
				return binarySearch(arr, target, start, mid - 1);
			else
				return binarySearch(arr, target, mid + 1, end);
		}
		
		if(target >= arr[mid] && target <= arr[end]) {
			return binarySearch(arr, target, mid + 1, end);
		}
		
		return binarySearch(arr, target, start, mid - 1);
	}

}
