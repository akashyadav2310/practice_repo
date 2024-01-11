package com.logical_practice.recursion;

//https://www.geeksforgeeks.org/sum-triangle-from-array/
//Sum triangle from array
public class TriangleSum { // ConstructTriangle

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5 };
		System.out.print(triangleSum(inputArray)); 
	}
	
	static int triangleSum(int[] input) {
		if(input.length < 1)
			return -1;
		if(input.length == 1)
			return input[0];
		int[] temp = new int[input.length - 1]; //Created temp array for storing an Sum of consecutive two elements in the previous level
		for(int i = 0; i < temp.length; i++) {
			temp[i] = input[i] + input[i + 1];
		}
		return triangleSum(temp);
	}

}
