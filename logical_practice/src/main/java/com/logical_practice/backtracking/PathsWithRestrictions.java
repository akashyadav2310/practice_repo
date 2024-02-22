package com.logical_practice.backtracking;

// False in a board(input) is a restrictions 
public class PathsWithRestrictions {

	public static void main(String[] args) {
		boolean[][] board = {
								{true, true, true},
								{true, false, true},			
								{true, true, true}
							}; // false means you can't go/choose this path to reach the target
		pathsRestrictions("", board, 0, 0);  // Starts from 0th row and 0th column
	}
	
	static void pathsRestrictions(String p, boolean[][]  maze, int row, int col) {
		if(row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[row][col]) { // means we check at that point is there restrictions or not if yes.Then we stop there
			return;
		}
		
		if(row < maze.length - 1)
			pathsRestrictions(p + 'D', maze, row + 1, col);
		
		if(col < maze[0].length - 1)
			pathsRestrictions(p + 'R', maze, row, col + 1);
		
	}
	
}
