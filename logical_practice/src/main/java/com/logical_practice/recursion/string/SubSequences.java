package com.logical_practice.recursion.string;

import java.util.ArrayList;

// Print sub sequences of the string
// str = "abc"
// abc, ab, ac, a, bc , b, c 
public class SubSequences {

	public static void main(String[] args) {
		String str = "abcd";
		//Without returning any value void data type
		subSeq("", str);
		
		// Using ArrayList with passing list ref
		//ArrayList<String> ans = new ArrayList<>();
		//System.out.print(subSeqUsingList("", str, ans));
		
		// Using ArrayList but without a passing list ref
		//System.out.println(subSeqReturnList("", str));
		
	}

	// Without return type
	// p : process string up : unprocess string
	static void subSeq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		subSeq(p + ch, up.substring(1));
		subSeq(p, up.substring(1));
	}
	
	// Sub sequences using recursion, Passing list's reference and return the ArrayList
	// p : process string up : unprocessed string
	static ArrayList<String> subSeqUsingList(String p, String up,ArrayList<String> ans) {
		if(up.isEmpty()) {
			ans.add(p);
			return ans;
		}
			
		char ch = up.charAt(0);
			
		subSeqUsingList(p + ch, up.substring(1), ans);
		subSeqUsingList(p, up.substring(1), ans);
		return ans;
	}

	// Sub sequences using recursion, Passing list's reference and return the ArrayList
	// p : process string up : unprocessed string
	static ArrayList<String> subSeqReturnList(String p, String up) {
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
			
		char ch = up.charAt(0);
			
		ArrayList<String> left= subSeqReturnList(p + ch, up.substring(1));
		ArrayList<String> right = subSeqReturnList(p, up.substring(1));
		
		left.addAll(right); //Now left containing both side elements 
		
		return left; 
	}
	
}