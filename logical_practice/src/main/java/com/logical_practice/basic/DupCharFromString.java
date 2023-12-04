package com.logical_practice.basic;

import java.util.Scanner;

public class DupCharFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.nextLine();
		dupChars(input.toLowerCase());
	}

	
	public static void dupChars (String input) {
		char[] inputArray = input.toCharArray();
		
		for (int i = 0; i < inputArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < inputArray.length; j++) {
				if(inputArray[i] == inputArray[j] && inputArray[j] != ' ') {
					count++;
					inputArray[j] = '0';
				}
			}
			if(count > 1 && inputArray[i] != '0')  
				System.out.println(input+" contains "+inputArray[i]+" "+ count + " times");   
		}
	}
	
}
