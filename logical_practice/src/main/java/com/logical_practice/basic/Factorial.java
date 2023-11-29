package com.logical_practice.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		//int ans = factorials(input);
		int ans = factorialsUsingRecurssion(input);
		System.out.print(ans);
	}
	//Using recursion
	public static int factorialsUsingRecurssion(int input) {
		if(input == 0)
			return 1;
		else
			return input * factorialsUsingRecurssion(input - 1);
	}

	public static int factorials(int input) {
		int factorial = 1;
		for(int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
