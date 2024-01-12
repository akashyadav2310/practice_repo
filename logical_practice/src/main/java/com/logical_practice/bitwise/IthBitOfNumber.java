package com.logical_practice.bitwise;

// Return the given decimal numbers ith bit value using left shift operator compare with AND 
public class IthBitOfNumber {

	public static void main(String[] args) {
		int number = 182;
		int ithBit = 5;
		System.out.print(ithBit(number, ithBit));
	}

	static int ithBit(int n, int i) {
//		// First method
//		int index = (int)Math.pow(2, i - 1);  // Using the left Shift formula ( a << b = a * 2 raise to the power b)
//		return (n & index);
		
		//Second Method
		return n & (1 << (i - 1));
	}
	
}
