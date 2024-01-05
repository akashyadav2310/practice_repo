package com.dsa.problems.sprting;
import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.
class MissingNumber_268 {
	
	public static void main(String args[]) {
		int[] input = {4, 1, 0, 3};
		int ans = missingNumber(input);
		System.out.print(ans);
		
	}
	
	static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i]; //Beacuse the array range is starts from 0
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else
                i++;
        }
        //Search for the correct index
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index)
                return index;
        }
        return nums.length;
    }
}