package com.dsa.search.binary;

import java.util.Arrays;

//Search using Binary algorithm in a given sorted 2-D array [Note : for this search 2-D array should be n*n (no of rows = No of columns )] 
public class Binary2DSearching {

	public static void main(String[] args) {
		
		//Sample array format
//		int[][] inputArr = { { 10, 20, 30, 40 }, 
//				 { 15, 25, 35, 45 }, 
//				 { 28, 29, 37, 49 }, 
//				 { 33, 34, 38, 50 }};
		
		int[][] inputArr = { { 10, 20, 30, 40 }, 
							 { 15, 25, 35, 45 }, 
							 { 28, 29, 37, 49 }, 
							 { 33, 34, 38, 50 }};
							// { 36, 39, 41, 55 }}; // Sorted 2-D Array
																												
		int target = 10;
		System.out.println(Arrays.toString(search(inputArr, target)));
	}

	public static int[] search(int[][] matrix, int target) {
		int r = 0;
		int c = matrix.length - 1;
		System.out.println("Matrix Length : " + matrix.length + ", C : " +c);
		while (r < matrix.length && c >= 0) {
			if(matrix[r][c] == target)
				return new int[]{r, c};
			if(matrix[r][c] < target)
				r++;
			else
				c--;
		}
		return new int[] { -1, -1 };
	}
}
