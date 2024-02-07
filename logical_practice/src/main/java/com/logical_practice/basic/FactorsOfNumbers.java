package com.logical_practice.basic;

import java.util.ArrayList;

public class FactorsOfNumbers {

	public static void main(String[] args) {
		int number = 36;
		factor(number);
	}
	
//	// Time Complexity is O(N)
//		static void factor1(int n) {
//			for(int i = 1; i <= n; i++) {
//				if(n % i == 0) 
//					System.out.print(i + " ");
//			}
//		}
	
	// Time Complexity is O(square root(N))
	static void factor(int n) {
		ArrayList<Integer> list = new ArrayList<>();  // List for factors/numbers after the square root of the given N
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				if(n / i == i)
					System.out.print(i + " ");
				else {
					System.out.print(i + " ");
					list.add(n/i); // It stores descending order
				}
			}
		}
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " "); // Iterate reverse so it prints ascending order
		}
	}

}
