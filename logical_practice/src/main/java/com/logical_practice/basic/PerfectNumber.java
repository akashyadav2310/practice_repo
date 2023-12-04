package com.logical_practice.basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = sc.nextInt();
		String ans = (isPerfectNumber(input)) ? "Number is Perfect" : "Number is not Perfect";
		System.out.println(ans);
	}

	public static boolean isPerfectNumber(int input) {
		int n = input;
		int sum = 0;
		for (int i = 1; i <= n/2 ; i++) {
			if(input % i == 0)
				sum += i;
		}
		return (sum == input) ? true : false;
	}

}
