package com.logical_practice.patterns;

public class P4 {
	
	public static void main(String[] args) {
		//		 * 
		//		* *
		//	   * * *
		//	  * * * *
		//	 * * * * *
		//	  * * * * 
		//	   * * *
		//		* *
		//		 *
		int n = 5; //length of the row		
		for (int row = 0; row < 2 * n; row++) {
			int totalColumnsInRow = row > n ? 2 * n - row : row;
			int noOfSpaces = n - totalColumnsInRow;
			for (int spaces = 0; spaces < noOfSpaces; spaces++) {
				System.out.print(" ");
			}
			for (int column = 0; column < totalColumnsInRow; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
