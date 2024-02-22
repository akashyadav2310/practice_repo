package com.logical_practice.backtracking;

import java.util.Arrays;

// Print All paths using backtracking
public class PrintAllPathsUsingBackTracking {

	public static void main(String[] args) {
		// here is no restriction, thats why we set all values to true
		boolean[][] board = {
								{true, true, true},
								{true, true, true},			
								{true, true, true}
							};
		// Empty path, board, row, column
		//pathsUsingBacktracking("", board, 0, 0);
		
		int[][] path = new int[board.length][board[0].length];
		// Empty path, board, row, column, path, steps
		pathStepsUsingBacktracking("", board, 0, 0, path, 0);
	}

	static void pathsUsingBacktracking(String p, boolean[][] maze, int row, int col) {
		
		if(row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[row][col])
			return;
		
		maze[row][col] = false;
		
		// If a row less than maze/2D array's length, Then we move Downward (Increase the row)
		if(row < maze.length - 1)
			pathsUsingBacktracking(p + 'D', maze, row + 1, col);
				
		// If a column less than maze/2D array's 0th index length, (means row's size), Then we move Right (Increase the column)
		if(col < maze[0].length - 1)
			pathsUsingBacktracking(p + 'R', maze, row, col + 1);
				
		// If a row > 0, Then we move Upward (Decrease the row)
		if(row > 0)
			pathsUsingBacktracking(p + 'U', maze, row - 1, col);
				
		// If a column > 0, Then we move Left (Decrease the column)
		if(col > 0)
			pathsUsingBacktracking(p + 'L', maze, row, col - 1);
		
		maze[row][col] = true;
		
	}
	
	// Print all paths steps
	static void pathStepsUsingBacktracking(String p, boolean[][] maze, int row, int col, int[][] path, int step) {
		
		if(row == maze.length - 1 && col == maze[0].length - 1) {
			path[row][col] = step; // last step also we adding at the last recursive, where we returns the path
			for(int[] arr : path) {
				System.out.println(Arrays.toString(arr)); // print path route using index
			}
			System.out.println(p); // print path
			System.out.println();
			return;
		}
		
		if(!maze[row][col])
			return;
		
		maze[row][col] = false; // set visited path for visited route so no other recursive function calls the visited path
		path[row][col] = step; // add the steps in path array
		
		// If a row less than maze/2D array's length, Then we move Downward (Increase the row)
		if(row < maze.length - 1)
			pathStepsUsingBacktracking(p + 'D', maze, row + 1, col, path, step + 1);
				
		// If a column less than maze/2D array's 0th index length, (means row's size), Then we move Right (Increase the column)
		if(col < maze[0].length - 1)
			pathStepsUsingBacktracking(p + 'R', maze, row, col + 1, path, step + 1);
				
		// If a row > 0, Then we move Upward (Decrease the row)
		if(row > 0)
			pathStepsUsingBacktracking(p + 'U', maze, row - 1, col, path, step + 1);
				
		// If a column > 0, Then we move Left (Decrease the column)
		if(col > 0)
			pathStepsUsingBacktracking(p + 'L', maze, row, col - 1, path, step + 1);
		
		maze[row][col] = true;
		path[row][col] = 0; // Revert changes means set count to 0 again
		
	}
	
}
