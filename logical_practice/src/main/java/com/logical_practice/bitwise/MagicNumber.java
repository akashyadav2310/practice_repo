package com.logical_practice.bitwise;


public class MagicNumber {

	public static void main(String[] args) {
		int input = 3; //Pass the number (If we pass 6 it takes 110 binary)
		System.out.print(magicNumber(input));
	}
	
	static int magicNumber(int n) {
		int ans = 0;
		// Here we want to check the magic number for 5 number's series
		int base = 5; //Set base for which you want to check the magic number for the specific number
		while(n > 0) {
			int lastDigit = n & 1;
			n = n >> 1;
			ans += lastDigit * base;
			base *= base;
		}
		return ans;
	}
}


//input = 6
//base = 5
//1st we will convert input to binary means 6 is in binary is " 1 1 0 "
//Then,
//0 * (5 raise to 1) + 1 * (5 raise to 2) + 2 * (5 raise to 3)   It starts from raise to the power 1 not 0
//0 + 25 + 125
//150
//
//Hence, the ans or we say 6th Magic number for the base 5 is 30
