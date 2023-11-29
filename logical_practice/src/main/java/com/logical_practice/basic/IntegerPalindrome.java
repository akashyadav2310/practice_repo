package com.logical_practice.basic;
import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		String ans = (isPalindromeNumber(input)) ? "Number is Palindrome" : "Number is not Palindrome";
		System.out.print(ans);

	}

	public static boolean isPalindromeNumber(int input) {
		int n = input;
		int reverseNum = 0;
		while(n > 0) {
			int digit = n % 10;
			reverseNum = reverseNum * 10 + digit;
			n = n / 10;
		}
		return (reverseNum == input) ? true : false;
	}

}
