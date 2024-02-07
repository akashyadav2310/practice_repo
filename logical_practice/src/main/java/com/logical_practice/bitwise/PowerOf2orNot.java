package com.logical_practice.bitwise;


// Find out the given number is power of 2 or not
// Solution, If the only 1 is present in the given number's binary then it is power of 2 otherwise nothing
public class PowerOf2orNot {

	public static void main(String[] args) {
		
		int number = 10;  // number should be greater than 0
		System.out.print(powerOf2(number));
	}
	static boolean powerOf2(int n){
//		int count = 0;
//		while(n > 0) {
//			int last = n & 1;
//			if(last == 1)
//				count++;
//			n = n >> 1;
//		}
//		return (count == 1) ? true : false;
		
		return ((n & (n - 1)) == 0) ? true : false;
	}

}
