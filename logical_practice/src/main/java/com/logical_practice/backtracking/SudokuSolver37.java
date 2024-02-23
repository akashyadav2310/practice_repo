package com.logical_practice.backtracking;

// Write a program to solve a Sudoku puzzle by filling the empty cells.
//
// A Sudoku solution must satisfy all of the following rules:
//
//	 1. Each of the digits 1-9 must occur exactly once in each row.
//	 2. Each of the digits 1-9 must occur exactly once in each column.
//	 3. Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
//
//	The '.' character indicates empty cells.
public class SudokuSolver37 {

	public static void main(String[] args) {
		int[][] board = {
				{ 5, 3, 0, 0, 7, 0, 0, 0, 0 },
				{ 6, 0, 0, 1, 9, 5, 0, 0, 0 },
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 },
				{ 4, 0, 0, 8, 0, 3, 0, 0, 1 },
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 },
				{ 0, 0, 0, 4, 1, 9, 0, 0, 5 },
				{ 0, 0, 0 ,0 ,8, 0, 0, 7, 9 }				
		};
		
//		int[][] board = new int[][]{
//            {3, 0, 6, 5, 0, 8, 4, 0, 0},
//            {5, 2, 0, 0, 0, 0, 0, 0, 0},
//            {0, 8, 7, 0, 0, 0, 0, 3, 1},
//            {0, 0, 3, 0, 1, 0, 0, 8, 0},
//            {9, 0, 0, 8, 6, 3, 0, 0, 5},
//            {0, 5, 0, 0, 9, 0, 6, 0, 0},
//            {1, 3, 0, 0, 0, 0, 2, 5, 0},
//            {0, 0, 0, 0, 0, 0, 0, 7, 4},
//            {0, 0, 5, 2, 0, 6, 3, 0, 0}
//    };
		
		if(solve(board)) {
			display(board);
		}else {
			System.out.println("Cannot solve");
		}
		
	}
	
	static boolean solve(int[][] board) {
		int n = board.length;
		int row = -1;
		int col = -1;
		
		// Initially we set there are empty element is in board
		boolean emptyLeft = true;
		
		// Check for every cell
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j] == 0) {
					row = i;
					col = j;
					emptyLeft = false;
					break;
				}
			}
			// If we found some empty element in row, then break
			if(emptyLeft== false) {
				break;
			}
		}
		
		// There are means no empty cell left
		if(emptyLeft == true) {
			return true;
		}
		
		// Backtrack for number (1 - 9)
		for (int number = 1; number <= 9; number++) {
			if(isSafe(board, row, col, number)) {
				board[row][col] = number;
				if(solve(board)) {
					// found the answer
					return true;
				}else {
					// backtrack
					board[row][col] = 0;
				}
			}
		}
		
		return false;
	}
	
	private static void display(int[][] board) {
		for(int[] row : board) {
			for(int number : row) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
		
	}

	static boolean isSafe(int[][] board, int row, int col, int number) {
		
		// Check the number is already present in the row
		for(int i = 0; i < board.length; i++) {
			// Check if the number is in the row
			if(board[row][i] == number)
				return false;
		}
		
		// Check the number is already present in the column
		for(int i = 0; i < board.length; i++) {
			// Check if the number is in the column
			if(board[i][col] == number)
				return false;
		}
		
		int sqrt = (int)(Math.sqrt(board.length));
		int rowStart = row - row % sqrt;
		int colStart = col - col % sqrt;
		
		for(int r = rowStart; r < rowStart + sqrt; r++) {
			for(int c = colStart; c < colStart + sqrt; c++) {
				// Check if the number is in the cell
				if(board[r][c] == number)
					return false;
			}
		}

		return true;
	}

}
