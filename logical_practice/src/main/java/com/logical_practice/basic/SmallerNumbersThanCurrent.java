package com.logical_practice.basic;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {

	public static void main(String[] args) {
		int[] nums = {8, 1, 2, 2, 4};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result= nums.clone();
        System.out.println("Result : " +Arrays.toString(result));
        Arrays.sort(result); // sorted array (ascending)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(result[i],i); // add result[i] as a key and 
            							  //  add i as a value (Because i means number of element are smaller than this number)	
        }
       
        for(int i = 0; i < nums.length; i++){
            result[i] = map.get(nums[i]);
        }
        return result;
     }

}
