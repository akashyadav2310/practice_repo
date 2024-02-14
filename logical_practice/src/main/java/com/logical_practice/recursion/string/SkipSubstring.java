package com.logical_practice.recursion.string;

import java.util.Scanner;

// Skip the given SubString from the given String
public class SkipSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a input : ");
		String inputString = scanner.next();
		scanner.close();
		//skipSubstring("", inputString);  // Pass empty String because after recursive call we add the char who != 'a'
		//System.out.print(skipSubstring(inputString)); // With return type String
		System.out.print(skipAppNotApple(inputString)); 
	}
	
	// return type : String
	// up: input (Is use for passing an string which removes first char after passing to an recursion)
	static String skipSubstring(String up) {
			
		if(up.isEmpty()) {
			return "";
		}
			
		if(up.startsWith("apple")) {  // check if string starts with apple
			return skipSubstring(up.substring(5));  // remove first 5 chars (Because length of apple is 5) and pass substring as from next index
		}else {
			return up.charAt(0) + skipSubstring(up.substring(1)); // return and add char which is not starts with apple
		}
			
	}
	
	// Skip "app" only (only print "le") when "apple" substring is found
	static String skipAppNotApple(String up) {
		
		if(up.isEmpty()) {
			return "";
		}
			
		if(up.startsWith("apple")) {  // check if string starts with apple
			return skipAppNotApple(up.substring(3));  // remove first 5 chars (Because length of apple is 5) and pass substring as from next index
		}else {
			return up.charAt(0) + skipAppNotApple(up.substring(1)); // return and add char which is not starts with apple
		}
			
	}
	
}
