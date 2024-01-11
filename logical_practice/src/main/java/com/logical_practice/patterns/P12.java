package com.logical_practice.patterns;

public class P12 {

//	    * * * * *
//	     * * * *
//	      * * *
//	       * *
//	        *
//	        *
//	       * *
//	      * * *
//	     * * * *
//	    * * * * *
	
	public static void main(String[] args) {
		int n = 5;
		for(int row = 0; row < 2 * n; row++) {
			int totalColumns = row < n ? n - row : row - n + 1;
			int noOfSpaces = n - totalColumns;
			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalColumns; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
