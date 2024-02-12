package com.logical_practice.recursion;

import java.util.ArrayList;

public class MultipleIndexesOfNumberInArray {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 4, 9, 21, 33, 37, 49, 50};
		int target = 4;
		System.out.println(targetIndexes(input, target, 0, new ArrayList<>()));
		//System.out.println(targetIndex(input, target, 0));
	}
	
	static ArrayList<Integer> targetIndexes(int arr[], int target, int index, ArrayList<Integer> list){
		if(index == arr.length)
			return list;
		if(arr[index] == target)
			list.add(index);
		return targetIndexes(arr, target, index + 1, list);
	}

//	// Note : not use this below(targetIndex) type of approach
//	// Without passing a list as an argument 
//	static ArrayList<Integer> targetIndex(int arr[], int target, int index){
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		if(index == arr.length)
//			return list;
//		
//		// This will contain answer that call only
//		if(arr[index] == target)
//			list.add(index);
//		ArrayList<Integer> ansFromRecCalls = targetIndex(arr, target, index + 1);
//		list.addAll(ansFromRecCalls); // added all answers
//		return list;
//	}
	
}
