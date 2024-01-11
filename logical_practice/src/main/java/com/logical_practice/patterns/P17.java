package com.logical_practice.patterns;

public class P17 {

	public static void main(String[] args) {
	//	      	1
	//        2 1 2
	//    	3 2 1 2 3
	//    4 3 2 1 2 3 4
	//		3 2	1 2 3
	//		  2 1 2
	//			1
		
		int n = 5;
		for(int row = 1; row <= 2 * n; row++) {
			int totalColumns = row > n ? 2 * n - row : row;
			int noOfSpaces = n - totalColumns;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
			for (int col = totalColumns; col >= 1; col--) {
				System.out.print(col +" ");
			}
			for (int col = 2; col <= totalColumns; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
