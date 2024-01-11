package com.logical_practice.recursion;

public class SumOfDigitsOfNumberUsingRec {
	
	public static void main(String args[]) {
		int input = 123456789;
		int ans = sumOfNumbers(input);
		System.out.print("Sum of digit of a given number : " +ans);
	}

	static int sumOfNumbers(int number) { //(int sum, int number) {
		// Base Condition
		if(number <= 0)
			return number;
		
		return ((number % 10) + sumOfNumbers(number / 10));
		
	}
	
}
