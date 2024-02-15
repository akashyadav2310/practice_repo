package com.logical_practice.recursion;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		String str = "abc";
		permutations("", str);
		//System.out.println(permutationsList("", str));
		//System.out.println(permutationsCount("", str));
	}

	static void permutations(String p, String up) {
		
		if(up.length() == 0) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		// take a char for each position of iteration
		for(int i = 0; i <= p.length(); i++) {
			String firstStr = p.substring(0, i); // make a substring of 0 - i 
			String secondStr = p.substring(i, p.length()); // make a substring of i - length
			permutations(firstStr + ch + secondStr, up.substring(1)); // join first + ch + second and pass to the recursive call
		}
		
	}
	
	// Returning an ArrayList
	static ArrayList<String> permutationsList(String p, String up) {
		
		if(up.length() == 0) {
			ArrayList<String> list = new ArrayList<>(); 
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		// Local to this call
		ArrayList<String> ans = new ArrayList<>();
		
		// take a char for each position of iteration
		for(int i = 0; i <= p.length(); i++) {
			String firstStr = p.substring(0, i); // make a substring of 0 - i
			String secondStr = p.substring(i, p.length()); // make a substring of i - length
			ans.addAll(permutationsList(firstStr + ch + secondStr, up.substring(1))); // join first + ch + second and pass to the recursive call
		}
		
		return ans;
	}
	
		// Returning an count of permutations
//		static int permutationsCount(String p, String up) {
//			// Formula, Permutations count = n!  
//			// But we want to replace in the same function and return the permutations count
//			if(up.length() == 0) {
//				return 1;
//			}
//			
//			char ch = up.charAt(0);
//			
//			// Local to this call
//			int cnt = 0;
//			
//			// take a char for each position of iteration
//			for(int i = 0; i <= p.length(); i++) {
//				String firstStr = p.substring(0, i); // make a substring of 0 - i
//				String secondStr = p.substring(i, p.length()); // make a substring of i - length
//				cnt += permutationsCount(firstStr + ch + secondStr, up.substring(1)); // join first + ch + second and pass to the recursive call
//			}
//			
//			return cnt;
//		}
	
}
