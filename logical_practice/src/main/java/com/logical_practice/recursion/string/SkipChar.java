package com.logical_practice.recursion.string;

import java.util.Scanner;

// Skip a char specific from given String. Here we skipping char 'a' from the given String 
public class SkipChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a input : ");
		String inputString = scanner.next();
		scanner.close();
		//skipChar("", inputString);  // Pass empty String because after recursive call we add the char who != 'a'
		System.out.print(skipChar(inputString)); // With return type String
	}

	// str : ans (first we get "", because first it empty)
	// up: input (Is use for passing an string which removes first char after passing to an recursion)
	static void skipChar(String str, String up) {
		if(up.isEmpty()) {
			System.out.print(str);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {  // if char equals to char 'a' or not always we need to remove first char and pass remaining String to recursive call
			skipChar(str, up.substring(1));  // remove first char and pass substring as from next index
		}else {
			skipChar(str + ch, up.substring(1)); // add char who != 'a' and pass recursive call
		}
	}
	
	// With return type String
	// up: input (Is use for passing an string which removes first char after passing to an recursion)
	static String skipChar(String up) {
		
		if(up.isEmpty()) {
			return "";
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {  // if char equals to char 'a' or not always we need to remove first char and pass remaining String to recursive call
			return skipChar(up.substring(1));  // remove first char and pass substring as from next index
		}else {
			return ch + skipChar(up.substring(1)); // return and add char who != 'a'
		}
		
	}
	
}
