package com.logical_practice.patterns;

public class P2 {
	public static void main(String[] args) {
		
//		* * * * 			1 2 3 4				1 2 3 4
//		* *	*	   or		1 2 3		or		5 6 7 
//		* * 				1 2 				8 9 
//		*					1 					10
		
		int n = 4;
		for(int row = n; row >= 1 ; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print(" * ");
				//System.out.print(" " +column);
			}
			System.out.println();			
		}
	}
}
