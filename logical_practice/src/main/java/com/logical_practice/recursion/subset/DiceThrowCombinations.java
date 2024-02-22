package com.logical_practice.recursion.subset;

import java.util.ArrayList;

public class DiceThrowCombinations {

	public static void main(String[] args) {
		int target = 4;
		
		//diceNumberCombinations("",target);
	
		ArrayList<String> ans = diceNumberCombinationsList("", target);
		System.out.print(ans);
	}
	
	static void diceNumberCombinations(String p, int target){

		if(target == 0){
			System.out.println(p);
			return;
		}
		
		for(int i = 1; i <= 6 && i <= target; i++) {
			diceNumberCombinations(p + i, target - i);
		}
		
	}
	
	// p: processed, target: target
	static ArrayList<String> diceNumberCombinationsList(String p, int target){
		
		if(target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i = 1; i <= 6 && i <= target; i++) {
				ans.addAll(diceNumberCombinationsList(p + i, target - i));
			}
		
		return ans;
	}

}
