package com.logical_practice.recursion.string;

import java.util.ArrayList;
import java.util.Scanner;

// for 1 - 9 digits
// keypad
//  1	  2	    3
// abc   def   ghi
// 
//  4 	  5	    6
// jkl   mno   pqr 
// 
//  7     8	    9 
// stu   vwx   yz  

public class KeyPadCombinations1_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a keypad numbers : ");
		String inputNumbers = scanner.next();
		scanner.close();
		//keyPad("",inputNumbers);  // "" is a processed string which we pass first empty and inputNumbers is input number String
		System.out.println(keyPadList("",inputNumbers));
	}
	
	// Without return type
	static void keyPad(String p, String up) {
		if(up.length() == 0) {
			System.out.println(p);
			return;
		}
		
		int digit = up.charAt(0) - '0';
		
		for(int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			if(ch == '{') // because digit 9 contains only y and z chars but we set 3 chars to each digit so for 3rd iteration of digit 9 gives '{' thats time we break the loop
				break;
			keyPad(p + ch, up.substring(1));
		}
		
	}
	
	//With Arraylist return type
	static ArrayList<String> keyPadList(String p, String up) {
		if(up.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		int digit = up.charAt(0) - '0';
			
		ArrayList<String> ans = new ArrayList<>();
			
		for(int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			if(ch == '{') // because digit 9 contains only y and z chars but we set 3 chars to each digit so for 3rd iteration of digit 9 gives '{' thats time we break the loop
				break;
			ans.addAll(keyPadList(p + ch, up.substring(1)));
		}
		
		return ans;
	}

}
