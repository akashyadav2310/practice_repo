package com.logical_practice.bitwise;

// Find the Unique Number form Array using XOR (bitwise)
public class FindUniqueNumber {

	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 6, 3, 2, 1};
		int ans = uniqueNumber(arr);
		System.out.println("Unique element from the given array is  : " +ans);
	}

	static int uniqueNumber(int[] arr) {
		int unique = 0; //First initialize unique to 0
		
		for(int n : arr) {
			unique ^= n;
			//System.out.println(unique);
		}
		
		return unique;
	}
}
