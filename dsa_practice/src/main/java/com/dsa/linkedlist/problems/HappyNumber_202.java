package com.dsa.linkedlist.problems;

// https://leetcode.com/problems/happy-number/description/
public class HappyNumber_202 {

	public static void main(String[] args) {
		int input = 19;
		System.out.println(isHappy(input));
	}
	
	public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
        	slow = numbersDigitSquare(slow);
        	fast = numbersDigitSquare(numbersDigitSquare(fast));
        }
        while(fast != slow);
        
        if(fast == 1)
        	return true;
        
		return false;
    }
	
	private static int numbersDigitSquare(int num){
		if(num == 0)
			return 0;
		int sumOfDigitsSquare = 0;
		while(num > 0) {
			int digit = num % 10;
			sumOfDigitsSquare += digit * digit;
			num /= 10;
		}
		return sumOfDigitsSquare;
	}

}
