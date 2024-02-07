package com.logical_practice.bitwise;

// Find out the sum of nth row of the given Pascal Triangle
// Pascal Triangle
//1
//1  1
//1  2  1
//1  3  3  1
//1  4  6  4  1
//1  5 10 10  5  1
//1  6 15 20 15  6  1

// Formula, For nth row sum = 2 raise to the power of the n - 1  ........(n means row number)
public class PascalTriangleNthRowSum {

	public static void main(String[] args) {
		int n = 5;
		sumOfTheNthNumber(n);
	}
	static void sumOfTheNthNumber(int n) {
		int ans = 1 << (n - 1);
		System.out.print(ans);
	}

}
