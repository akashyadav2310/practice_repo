package com.logical_practice.basic;

import java.util.Scanner;


public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String input = sc.nextLine();
		String ans = (isPalindrome(input)) ? "String is Palindrome" : "String is not Palindrome";
		System.out.print(ans);

	}

	public static boolean isPalindrome(String input) {
		String rev = "";
		// For Case insensitive we can convert the given input string to lowercase and check it is palindrome or not
		//input = input.replaceAll("[^a-zA-Z]+","").toLowerCase();
		int len = input.length();
		
		for(int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		
		return (input.equals(rev)) ? true : false;
	}

}
