package com.logical_practice.basic;

//Removing repeated elements from an sorted array
public class RemoveDupEleSortedArray {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 20, 30, 30, 40, 40, 50, 50, 50, 60, 60, 60, 70};
		removeDupEleFromAnArray(numbers);
	}

	private static void removeDupEleFromAnArray(int[] numbers) {
		int n = numbers.length;
		int[] temp = new int[numbers.length];
		int j = 0;
		for(int i = 0; i < n - 1; i++) {
			if(numbers[i] != numbers[i+1])
				temp[j++] = numbers[i];
		}
		temp[j++] = numbers[n - 1];
//		for(int k = 0; k < j; k++) {
//			numbers[k] = temp[k];
//		}
		
		for(int k = 0; k < j; k++) {
			System.out.print(temp[k] + " ");
		}
		
	}

}
