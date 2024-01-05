package com.dsa.sort;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] arr = {20, 50, 10, 30, 40};
		//int[] arr = {-10, -20, 20, -10, -30, -10, 40, 50};
		int[] sortedArray = bubbleSorting(arr);
		System.out.print("Sorted Array : ");
		System.out.print(Arrays.toString(sortedArray));
	}

	public static int[] bubbleSorting(int[] arr) {
		boolean swapped;
		//Run the steps arr.length (n - 1) times
		for(int i = 0; i < arr.length; i++) {
			swapped = false;
			// At the each step, max item will comes at the respective index
			for (int j = 1; j < arr.length - i; j++) {
				//System.out.println(i + " " + j);
				//Swap the arr[j] element is smaller than the previous one means arr[j-1]
				if(arr[j] < arr[j - 1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			// If index did not swap for particular i index, means the array is sorted hence stop the program
			if(!swapped) {
				break;
			}
		}
		
		return arr;
	}
	
}
