package com.logical_practice.recursion.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.Scanner;

//A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//for 2 - 9 digits ('digits' must consist of values from 2 to 9 only)
//	 1	  2	   3
//	 -   abc  def   
//
//	 4 	  5	   6
//  ghi	 jkl  mno  
//
// 	 7    8	   9 
// pqrs  tuv  wxyz  

public class KeyPadCombinations2_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a keypad digits 'digits' must consist of values from 2 to 9 only) : ");
		String digits = scanner.next();
		scanner.close();
		
		if(digits==null || digits.isEmpty()) {
			System.out.println("Enter a valid digit..");
			return;
		}
		//keyPad("",digits);  // "" is a processed string which we pass first empty and inputNumbers is input number String
		//System.out.println(keyPadList("",digits)); // With return type List

		// Using void recursive solution with Runtime : 0ms
	        Map<Character,String> numList = new HashMap<>();

	        numList.put('2',"abc");
	        numList.put('3',"def");
	        numList.put('4',"ghi");
	        numList.put('5',"jkl");
	        numList.put('6',"mno");
	        numList.put('7',"pqrs");
	        numList.put('8',"tuv");
	        numList.put('9',"wxyz");


	        List<String> ans = new ArrayList<>();

	        letterCombinationHelper(digits,new StringBuilder(),ans,numList);

	        System.out.println(ans);
		
	}

	// Without return type
	static void keyPad(String p, String up) {
		if(up.length() == 0) {
			System.out.println(p);
			return;
		}
			
		int digit = up.charAt(0) - '0';
		
		if(digit == 7) {
			
			for(int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
				char ch = (char) ('a' + i);
				keyPad(p + ch, up.substring(1));
			}
			
		}else if(digit == 8) {
			
			for(int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3; i++) {
				char ch = (char) ('a' + i);
				keyPad(p + ch, up.substring(1));
			}
			
		}
		else if(digit == 9) {
		
			for(int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3 + 1; i++) {
				char ch = (char) ('a' + i);
				keyPad(p + ch, up.substring(1));
			}
			
		}else {
		
			for(int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
				char ch = (char) ('a' + i);
				keyPad(p + ch, up.substring(1));
			}
			
		}
	}
	
		// With ArrayList return type
		static ArrayList<String> keyPadList(String p, String up) {
			if(up.length() == 0) {
				ArrayList<String> list = new ArrayList<>(); 
				list.add(p);
				return list;
			}
				
			int digit = up.charAt(0) - '0';
			
			ArrayList<String> ans = new ArrayList<>();
			
			if(digit == 7) {
				
				for(int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
					char ch = (char) ('a' + i);
					ans.addAll(keyPadList(p + ch, up.substring(1)));
				}
				
			}else if(digit == 8) {
				
				for(int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3; i++) {
					char ch = (char) ('a' + i);
					ans.addAll(keyPadList(p + ch, up.substring(1)));
				}
				
			}
			else if(digit == 9) {
			
				for(int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3 + 1; i++) {
					char ch = (char) ('a' + i);
					ans.addAll(keyPadList(p + ch, up.substring(1)));
				}
				
			}else {
			
				for(int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
					char ch = (char) ('a' + i);
					ans.addAll(keyPadList(p + ch, up.substring(1)));
				}
				
			}
			
			return ans;
		}
		
	
		static void letterCombinationHelper(String digits,StringBuilder str,List<String> ans,Map<Character,String> mapOfNum)
	    {
	        if(digits.length() == 0)
	        {
	            ans.add(str.toString());
	            return;
	        }

	        Character curr = digits.charAt(0);
	        String currStr = mapOfNum.get(curr);

	        for(int i=0; i < currStr.length(); i++)
	        {
	            str.append(currStr.charAt(i));
	            letterCombinationHelper(digits.substring(1),str,ans,mapOfNum);
	            str.deleteCharAt(str.length()-1);
	        }
	    }
	
}
