package com.logical_practice.patterns;

public class P3 {

	public static void main(String[] args) {
//		* 
//		* *
//		* * *
//		* * * *
//		* * *
//		* * 
//		*
		int n = 5; //length of the row		
		for (int row = 0; row < 2 * n; row++) {
			int totalColumnsInRow = row > n ? 2 * n - row : row;
			for (int column = 0; column < totalColumnsInRow; column++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
