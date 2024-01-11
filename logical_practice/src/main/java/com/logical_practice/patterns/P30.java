package com.logical_practice.patterns;

public class P30 {

	public static void main(String[] args) {
//				    1
//			      2 1 2
//			    3 2	1 2 3
//			  4 3 2 1 2 3 4
//			5 4 3 2	1 2 3 4 5
		
		int n = 5;
		for(int row = 1; row <= n; row++) {
			int noOfSpaces = n - row;
			for(int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col +" ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
