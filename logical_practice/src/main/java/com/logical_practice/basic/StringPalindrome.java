package com.logical_practice.basic;

import java.util.Scanner;

import ch.qos.logback.core.joran.conditional.IfAction;


public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String input = sc.nextLine();
		String ans = (isPalindrome(input)) ? "String is Palindrome" : "String is not Palindrome";
		System.out.print(ans);

	}

	public static boolean isPalindrome(String input) {
		
//		String rev = "";
//		// For Case insensitive we can convert the given input string to lowercase and check it is palindrome or not
//		//input = input.replaceAll("[^a-zA-Z]+","").toLowerCase();
//		int len = input.length();
//		
//		for(int i = len - 1; i >= 0; i--) {
//			rev = rev + input.charAt(i);
//		}
//		
//		return (input.equals(rev)) ? true : false;
		
		// Second method
		if(input == null || input.length() == 0)
			return true;
		input = input.replaceAll("[^a-zA-Z]+","").toLowerCase();
		int start = 0;
		int end = input.length() - 1;
		while(start < end - 1){//int i = 0; i <= end / 2; i++) {
			if(input.charAt(start) != input.charAt(end))
				return false;
			else {
				start++;
				end--;
			}
		}
		return true;
		
	}

}
