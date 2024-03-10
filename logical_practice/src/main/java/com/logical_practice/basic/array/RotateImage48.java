package com.logical_practice.basic.array;

public class RotateImage48 {

	public static void main(String[] args) {
//		int arr[][] = { { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 },
//                { 13, 14, 15, 16 } };
		
		int arr[][] = { { 1, 2, 3},
						{ 4, 5, 6 },
						{ 7, 8, 9} 
					   };
		
		rotate90Clockwise(arr);
		printMatrix(arr);
	}
	
	private static void rotate90Clockwise(int[][] matrix) {
		int N = matrix.length;
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N / 2; j++){
				
			}
		}
		
	}

	static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j <matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
