package com.logical_practice.recursion;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		sc.close();
		printTrianglePattern(input, input); // row : input and column : input
		printTrianglePatternReverse(input, 0); // row : input and column : 0
	}

	//	*
	//	* *
	//	* * *
	//	* * * *
	static void printTrianglePattern(int row, int col) {
		int temp = col;
		if(col == 0)
			return;
		while(col <= row) {
			System.out.print("* ");
			col++;
		}
		System.out.println();
		printTrianglePattern(row, temp - 1);
	}
	
	//	* * * *
	//	* * *
	//	* *
	//	*
	static void printTrianglePatternReverse(int row, int col) {
		if(row == 0)
			return;
		while(col < row) {
			System.out.print("* ");
			col++;
		}
		System.out.println();
		printTrianglePatternReverse(row - 1 , 0);
	}
	
}
