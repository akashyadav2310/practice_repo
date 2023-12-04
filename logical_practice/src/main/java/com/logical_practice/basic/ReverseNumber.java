package com.logical_practice.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		int ans = reverseNumber(input); 
		System.out.println("Reverse Number : "+ans);

	}

	public static int reverseNumber(int input) {
		int reverseNum = 0;
		while(input > 0) {
			int digit = input % 10;
			reverseNum = reverseNum * 10 + digit;
			input = input / 10;
		}
		return reverseNum;
	}

}
