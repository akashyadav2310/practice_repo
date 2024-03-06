package com.logical_practice.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens51 {

	public static void main(String[] args) {
		System.out.print(solveNQueens(4));

	}
	
	static List<List<String>> solveNQueens(int n) {
		String[][] board = new String[n][n];
		for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "."; // Set each element to the desired value
            }
        }
	    return printQueens(board, 0);
	}
	
	static List<List<String>> printQueens(String[][] board,int row){
	    if(row == board.length){
	            List<List<String>> listN = new ArrayList<>();
	            List<String> boardCombo = possibleQueensCombo(board);
	            listN.add(boardCombo);
	            return listN;
	     }

	    List<List<String>> ans = new ArrayList<>();    

	    for(int col = 0; col < board.length; col++){
	        if(isSafe(board, row, col)){
	                board[row][col] = "Q";
	                ans.addAll(printQueens(board, row + 1));
	                board[row][col] = ".";
	        }
	    }
	    return ans;
	}

	static boolean isSafe(String[][] board, int row, int col){
	        // Check verticalliy (row-wise)
	        for(int i = 0; i < row; i++){
	            if(board[i][col] == "Q")
	                return false;
	        }

	        // Check Diagonally Left
	        int maxLeft  = Math.min(row, col);
	        for(int i = 1 ; i <= maxLeft; i++){
	            if(board[row - i][col - i] == "Q")
	                return false;
	        }

	        // Check Diagonally Right
	        int maxRight  = Math.min(row, board.length - 1 - col);
	        for(int i = 1 ; i <= maxRight; i++){
	            if(board[row - i][col + i] == "Q")
	                return false;
	        }

	     return true;
	}

	static List<String> possibleQueensCombo(String[][] board){
	     List<String> list = new ArrayList<>();
	        for(String[] row : board){
	            String rowEle = "";
	            for(String element : row){
	            	//System.out.print(element + " ");
	                rowEle += element;
	            }
	            list.add(rowEle);
	        }
	        return list;
	 }
	
}

//https://leetcode.com/problems/n-queens/
//class Solution {
//    public List<List<String>> solveNQueens(int n) {
//        String[][] board = new String[n][n];
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = "."; // Set each element to the desired value
//            }
//        }
//
//        return printQueens(board, 0);
//    }
//    static List<List<String>> printQueens(String[][] board,int row){
//        if(row == board.length){
//            List<List<String>> list = new ArrayList<>();
//            List<String> boardCombo = possibleQueensCombo(board);
//            list.add(boardCombo);
//            return list;
//        }
//
//        List<List<String>> ans = new ArrayList<>();    
//
//        for(int col = 0; col < board.length; col++){
//            if(isSafe(board, row, col)){
//                board[row][col] = "Q";
//                ans.addAll(printQueens(board, row + 1));
//                board[row][col] = ".";
//            }
//        }
//        return ans;
//    }
//
//    static boolean isSafe(String[][] board, int row, int col){
//        // Check verticalliy (row-wise)
//        for(int i = 0; i < row; i++){
//            if(board[i][col] == "Q")
//                return false;
//        }
//
//        // Check Diagonally Left
//        int maxLeft  = Math.min(row, col);
//        for(int i = 1 ; i <= maxLeft; i++){
//            if(board[row - i][col - i] == "Q")
//                return false;
//        }
//
//        // Check Diagonally Right
//        int maxRight  = Math.min(row, board.length - 1 - col);
//        for(int i = 1 ; i <= maxRight; i++){
//            if(board[row - i][col + i] == "Q")
//                return false;
//        }
//
//        return true;
//    }
//
//    static List<String> possibleQueensCombo(String[][] board){
//        List<String> list = new ArrayList<>();
//        for(String[] row : board){
//            String rowEle = "";
//            for(String element : row){
//                rowEle += element;
//            }
//            list.add(rowEle);
//        }
//        return list;
//    }
//}