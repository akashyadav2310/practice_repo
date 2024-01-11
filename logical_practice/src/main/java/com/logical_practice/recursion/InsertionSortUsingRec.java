package com.logical_practice.recursion;

import java.util.Arrays;

//https://www.geeksforgeeks.org/recursive-insertion-sort/
public class InsertionSortUsingRec {

	public static void main(String[] args) {
		int[] input = {50, 60, 10, 20, 70, 40, 30};
		int[] sortedArray = insertionSort(input, 0, input.length);
		System.out.print(Arrays.toString(sortedArray));
	}
	
	static int[] insertionSort(int[] input,int i, int n) {
		
		if(i == n)
			return input;
		int j = i;
		while(j > 0 && input[j] < input[j - 1]) {
				int temp = input[j];
				input[j] = input[j - 1];
				input[j - 1] = temp;
				j--;
		}
		return insertionSort(input, i + 1, n);
	}

}
