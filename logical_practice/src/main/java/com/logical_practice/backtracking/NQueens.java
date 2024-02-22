package com.logical_practice.backtracking;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		int totalNoOfWays = nQueens(board, 0);
		System.out.println("Total No Of Ways to set Queen is : " +totalNoOfWays);
	}
	
	static int nQueens(boolean[][] board, int row){ //, int col) {
		if(row == board.length) { // if row == board.length - 1 means you visited all the row (we visits row-wise only)
			display(board); // show board where Queens is placed
			System.out.println();
			return 1;
		}
		
		int count = 0;
		
		// Placing the Queen and checking for every row and column
		for(int col = 0 ; col < board.length; col++) {
			// Place the Queen if it is safe
			if(isSafe(board, row, col)) {
				board[row][col] = true; // Set Queen
				count += nQueens(board, row + 1);
				board[row][col] = false; // Revert changes after recursive call
			}
		}
		
		return count;
	}

	private static boolean isSafe(boolean[][] board, int row, int col) {
		// Check vertical row
		for(int i = 0; i < row; i++) {
			if(board[i][col]) { // Check the board have already set Queen or not, if yes then return false
				return false;
			}
		}
		
		// Diagonal left
		int maxLeft = Math.min(row, col);
		for(int i = 1; i <= maxLeft; i++) {
			if(board[row - i][col - i]) { // Check the board have already set Queen or not, if yes then return false
				return false;
			}
		}
		
		// Diagonal right
		int maxRight = Math.min(row, board.length - 1 - col);
		for(int i = 1; i <= maxRight; i++) {
			if(board[row - i][col + i]) { // Check the board have already set Queen or not, if yes then return false
				return false;
			}
		}
		
		return true;
	}

	private static void display(boolean[][] board) {
		for(boolean[] row : board) {
			for(boolean element : row) {
				if(element)
					System.out.print("Q "); // Print Q
				else
					System.out.print("X "); // Print X
			}
			System.out.println();
		}
	}

}
