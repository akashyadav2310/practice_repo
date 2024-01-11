package com.logical_practice.patterns;

public class P5 {

	//	  *
	//    * *
	//    * * *
	//    * * * *
	//    * * * * *
	//    * * * *
	//    * * *
	//    * *
	//    *
	
	public static void main(String[] args) {
		int n = 5;
		for(int row = 0; row < 2 * n; row++) {
			int totalColumns = row < n ? row : 2 * n - row;
			int noOfSpaces = n - totalColumns;
			for (int col = 0; col < totalColumns; col++) {
				System.out.print("* ");
			}
			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
