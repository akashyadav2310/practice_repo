package com.logical_practice.patterns;

public class P1 {

	public static void main(String[] args) {
//		*					1					1
//		* *			or		1 2			or		2 3
//		* * *				1 2 3				4 5 6
//		* * * *				1 2 3 4				7 8 9 10
		int n = 4; //length of the row
		for(int row = 1; row <= n; row++) {
			// For every row, run the column( 0 to row's index)
			for(int column = 1; column <= row; column++) {
				//System.out.print(" * ");	// Print the * pattern
				//System.out.print(" " + column );	// Print the number "1, 1 2, 1 2 3, 1 2 3 4 " pattern
				 System.out.print(" " + (row + column - 1));
			}
			System.out.println();
		}
		
	}

}
