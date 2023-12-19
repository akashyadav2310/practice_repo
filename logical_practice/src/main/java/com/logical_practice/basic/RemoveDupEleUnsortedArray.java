package com.logical_practice.basic;

//Removing repeated elements from an unsorted array
public class RemoveDupEleUnsortedArray {
	
	public static void removeDupEleFromAnArray(int[] numbers) {
		for(int i = 0; i <= numbers.length - 1; i++) {
			for (int j = i + 1; j <= numbers.length - 1; j++) {
				if(numbers[i] == numbers[j]) 
					numbers[j] = 0;
			}
		}
		System.out.print("Unique elements from an Array are : [");
//		int len = 0;
//		int[] temp = new int[numbers.length];
		for(int number : numbers) {
			if(number != 0) {
				System.out.print(" " + number);
				//temp[len] = number;
				//len++;
			}
		}
//		for(int k = 0; k < len; k++) {
//			System.out.print(" " + temp[k]);
//		}
		System.out.println(" ]");
		
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,5,3,4,6,2,1,5,2,3};
		removeDupEleFromAnArray(numbers);

	}

}
