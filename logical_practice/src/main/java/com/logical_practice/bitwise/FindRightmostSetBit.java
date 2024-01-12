package com.logical_practice.bitwise;

//Find the Rightmost SetBit (means 1) of the given numbers
public class FindRightmostSetBit {

	public static void main(String[] args) {
		int n = 28;
		System.out.print(n);
	}

	static int rightMostSetBit(int n) {
		
		return n & (0 - n);
	}
	
}
