package com.logical_practice.backtracking;

import java.util.ArrayList;

// Directions :- D: Down, R: Right, C: Cross
public class PathsList {

	public static void main(String[] args) {
		int[][] target = {{3, 3}};
		
		//Print total paths including only Right and Down
		//paths("", target[0][0], target[0][1]);
		
		//System.out.print("Total Paths : " +pathsList("", target[0][0], target[0][1]));
		
		// Print total paths to reach target, including all Right, Down and also Diagonally
		pathsDiagonally("", target[0][0], target[0][1]);
	}

	// Without return type. Just go Right or Down not Diagonally
	static void paths(String p, int row, int col) {
		if(row == 1 && col == 1) {
			System.out.println(p);
			return;
		}
		
		if(row > 1)
			paths(p + 'D', row - 1, col);
		if(col > 1)
			paths(p + 'R', row, col - 1);
	}
	
	// Just go Right or Down not Diagonally
	static ArrayList<String> pathsList(String p, int row, int col){
		if(row == 1 && col == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		if(row > 1)
			ans.addAll(pathsList(p + 'D', row - 1, col));
		if(col > 1)
			ans.addAll(pathsList(p + 'R', row, col - 1));
		
		return ans;
	}
	
	static void pathsDiagonally(String p, int row, int col) {
		if(row == 1 && col == 1) {
			System.out.println(p);
			return;
		}
		
		if(row > 1 && col > 1)
			pathsDiagonally(p + 'C', row - 1, col - 1);// C : cross / Diagonally
		
		if(row > 1)
			pathsDiagonally(p + 'D', row - 1, col);
		if(col > 1)
			pathsDiagonally(p + 'R', row, col - 1);
		
	}
}
