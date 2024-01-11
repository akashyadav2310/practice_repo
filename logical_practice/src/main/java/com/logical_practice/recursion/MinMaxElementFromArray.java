package com.logical_practice.recursion;

public class MinMaxElementFromArray {

	public static void main(String[] args) {
		int[] inputArr = {1, 4, 3, -5, 8, -4, 6};
		int minEle = minElement(inputArr, inputArr.length);
		int maxEle = maxElement(inputArr, inputArr.length);
		System.out.print("Minimum element of the given Array : " +minEle);
		System.out.print("\nMaximun element of the given Array : " +maxEle);
	}

	static int minElement(int[] input, int n) {
		if(n == 1)
			return input[0];
		return Math.min(input[n - 1], minElement(input, n - 1));
	}

	static int maxElement(int[] input, int n) {
		if(n == 1)
			return input[0];
		return Math.max(input[n - 1], maxElement(input, n - 1));
	}
	
}