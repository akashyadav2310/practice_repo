package com.logical_practice.backtracking;


// Find out the total paths to reach the target (Only should go Right or Down direction (Not Left or Up side)
public class CountingPaths {

	public static void main(String[] args) {
		int[][] target = {{3,3}};
		//target[0][0] +" "+ target[0][1] : passing target row and column 
		//int count =  pathsCount(target[0][0], target[0][1]);
		
		int count = pathsCountRDC(target[0][0], target[0][1]);
		
		System.out.print("Total Number of paths to reach the target is : " +count);
	}

	static int pathsCount(int row, int col){
		if( row == 1 || col == 1) {
			return 1;
		}
		int left = pathsCount(row - 1, col);
		int right = pathsCount(row, col - 1);
		
		return left + right;
	}
	
	// Return Count of paths to reach target, including all Right, Down and also Diagonally
	static int pathsCountRDC(int row, int col){
		if( row == 1 || col == 1) {
			return 1;
		}
		
		int diagonally = pathsCountRDC(row - 1, col - 1);
		int left = pathsCountRDC(row - 1, col);
		int right = pathsCountRDC(row, col - 1);
		
		return left + right + diagonally;
	}
	
}
