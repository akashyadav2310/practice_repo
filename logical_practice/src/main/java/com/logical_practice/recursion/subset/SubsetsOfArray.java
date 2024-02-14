package com.logical_practice.recursion.subset;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find out the all subsets of the given array
public class SubsetsOfArray {

	public static void main(String[] args) {
		int[] input = {3, 5, 8};
		//System.out.print(subSetsReturnList(input));
		
		// Print the subsets of arrays for duplicates are in the array
		System.out.print(subSetsDuplicates(input));
	}
	
	static List<List<Integer>> subSetsReturnList(int[] arr) {
		
		List<List<Integer>> outerList = new ArrayList<>();
			
		outerList.add(new ArrayList<>());
			
		for(int num : arr) {
			int n = outerList.size();
			for(int i = 0; i < n; i++) {
				List<Integer> innerList = new ArrayList<>(outerList.get(i));
				innerList.add(num);
				outerList.add(innerList);
			}
		}
		
		return outerList; 
	}
	
	static List<List<Integer>> subSetsDuplicates(int[] arr) {
		Arrays.sort(arr);	// we need to sort first arr, Because this algo will works for duplicate adjacent elements 
		List<List<Integer>> outerList = new ArrayList<>();
			
		outerList.add(new ArrayList<>());
		
		// If we found the duplicate element then We need start from previous loop's end
		int start = 0; 
		int end = 0;
		
		for(int i = 0; i < arr.length; i++) {
			start = 0;
			// If the current and previous element are same then we set start = end + 1 (previous end + 1)
			if(i > 0 && arr[i] == arr[i - 1]) { // first check i > 0, because for i = 0 it gives error
				start = end + 1;
			}
			end = outerList.size() - 1;  // set last outer loops previous loops size
			int n = outerList.size();
			
			for(int j = start; j < n; j++) {
				List<Integer> innerList = new ArrayList<>(outerList.get(j));
				innerList.add(arr[i]);
				outerList.add(innerList);
			}
		}
		
		return outerList; 
	}

}
