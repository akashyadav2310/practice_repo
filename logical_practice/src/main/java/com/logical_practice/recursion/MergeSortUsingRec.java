package com.logical_practice.recursion;

import java.util.Arrays;

public class MergeSortUsingRec {

	public static void main(String[] args) {
		int[] arr = {6, 5, 7, 1, 9, 2, 8, 4, 3};
		//int[] ans = mergeSort(input);
		//System.out.println(Arrays.toString(ans));
		
		// Using In Place
		mergeSortInPlace(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] mergeSort(int[] arr) {
		
		if(arr.length == 1)
			return arr;
		
		int mid = arr.length / 2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right= mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		//Every time merge function calls
		return merge(left , right); 
	}

	static int[] merge(int[] first, int[] second) {
		
		int[] mix = new int[first.length + second.length];
		
		int i = 0;
		int j = 0;
		int k = 0;	
	
		while(i < first.length && j < second.length) {
			if(first[i] < second[j]) {
				mix[k] = first[i];
				i++;
			}else {
				mix[k] = second[j];
				j++;		
			}
			k++;
		}
		
		// It may be possible that first of array is not complete
		while(i < first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}
		// It may be possible that second of array is not complete
		while(j < second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}
		
		return mix;
	}
	
	// Sort using In place algorithm
	static void mergeSortInPlace(int[] arr, int start, int end) {
		
		if(end - start == 1)
			return;
		
		int mid = (start + end) / 2;
		
		mergeSortInPlace(arr, start, mid);
		mergeSortInPlace(arr, mid, end);
		
		//Every time merge function calls
		mergeInPlace(arr, start, mid, end); 
	}

	// Merge sorting using In place algorithm (In Place means without creating a separate arrays, change the values in the given array);
	static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int c = 0; c < mix.length; c++) {
            arr[start + c] = mix[c];
        }
	}
	
}
