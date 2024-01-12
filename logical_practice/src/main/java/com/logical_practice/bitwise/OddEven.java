package com.logical_practice.bitwise;

public class OddEven {

	public static void main(String[] args) {
		int number = 2;
		System.out.print((isOdd(number)) ? "Number is Odd" : "Number is Even");
	}

	static boolean isOdd(int n) {
		// n & 1 gives the last digit of the binary
		return (n & 1) == 1;	// If it return 1 means the given number is odd
	}
	
}
