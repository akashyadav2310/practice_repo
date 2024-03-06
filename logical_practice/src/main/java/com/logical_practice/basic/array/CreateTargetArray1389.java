package com.logical_practice.basic.array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArray1389 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 0};
		int[] index = {0, 1, 2, 3, 0};
        //Output: [0,1,2,3,4]
		int[] result = createTargetArray(nums, index);
		for(int ele : result)
			System.out.print(ele + " ");

	}
	
	public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length; // Length of nums and index are same so we takethe length of any one
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
        	list.add(index[i], nums[i]);
        }
        int[] target = list.stream().mapToInt(Integer::intValue).toArray();
        return target;
    }

}
