package com.logical_practice.basic;

//Calculate square root using the Newton Raphson Algorithm / Formula
public class SquareRootNewtonAlgo {

	public static void main(String[] args) {
		int number = 40;
		System.out.println(sqrt(number));
	}

	static double sqrt(int n) {
		double x = n;
		double root;
		while(true) {
			root = 0.5 * (x + (n / x));
			if(Math.abs(root - x) < 0.5)   // Check the error value till is less than 0.5
				break;
			x = root;
		}
		return root;
	}
}
