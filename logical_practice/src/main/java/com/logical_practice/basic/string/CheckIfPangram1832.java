package com.logical_practice.basic.string;

import java.util.ArrayList;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class CheckIfPangram1832 {

	public static void main(String[] args) {
		String inputStr = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(inputStr));
	}
	
	public static boolean checkIfPangram(String sentence) {

//		// Approach 1
//		ArrayList<Character> charList = new ArrayList<>();
//        int cnt = 0; // check char count 
//        for(int i = 0; i < sentence.length(); i++){
//            if(!charList.contains(sentence.charAt(i))){
//                charList.add(sentence.charAt(i));
//                cnt++;
//            }
//        }
//        return cnt == 26;
	
		// Approach 2
		int i = 0;
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(sentence.indexOf(ch));
			if(sentence.indexOf(ch) != -1){ // check every char is present or not in given String
                i++;
            }
        }
        return i >= 26 ? true : false;
	}

}
