package com.logical_practice.recursion;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int input = 10;
		int nthFiboNum = fibo(input);
		System.out.print(input +" fibonacci number of the Fibonacci Series is : " +nthFiboNum);
	}
	
	// To print nth Fibonacci number
	static int fibo(int n) {
		
		//Base condition
		if(n < 2)
			return n;
		
		// Recursive relation
		return fibo(n - 1) + fibo(n - 2);
	}

}
