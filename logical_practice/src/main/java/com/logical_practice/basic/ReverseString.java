package com.logical_practice.basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = sc.nextLine();
		String ans = reverseString(input); 
		System.out.println("Reverse String : "+ans);
	}

	public static String reverseString(String input) {
		String rev = " ";
		int len = input.length();
		for(int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}

}
