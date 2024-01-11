package com.logical_practice.patterns;

public class P31 {

	public static void main(String[] args) {

	//	  4 4 4 4 4 4 4  
    //    4 3 3 3 3 3 4   
    //    4 3 2 2 2 3 4   
    //    4 3 2 1 2 3 4   
    //    4 3 2 2 2 3 4   
    //    4 3 3 3 3 3 4   
    //    4 4 4 4 4 4 4

		int inputValue = 4;
		int n = (2 * inputValue) - 1;    // because array length (row) is 7 means from 0 - 7
		for(int row = 0; row < n ; row++) {
			for(int col = 0; col < n; col++) {
				// Because we wanted to find out min from(row, column, n - row, n - col)
				int valueAtEveryIndex = inputValue - Math.min(Math.min(row, col), Math.min(n - 1 - row, n - 1 - col));
				System.out.print(valueAtEveryIndex + " ");
			}
			System.out.println();
		}
	}

}
