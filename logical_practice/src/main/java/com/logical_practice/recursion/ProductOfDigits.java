package com.logical_practice.recursion;

import java.util.Scanner;

// 1342 : 1 * 3 * 4 * 2 = 24
// 2054 : 2 * 0 * 5 * 4 = 0 Because in the given number contains a zero ('0') digit 
public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number without '0' Otherwise it will return '0': ");
		int input = sc.nextInt();
		sc.close();
		int ans = productOfDigits(input);
		System.out.print(ans);
	}
	//Using recursion
	public static int productOfDigits(int number) {
		if(number % 10 == number)
			return number;
		else
			return (number % 10) * productOfDigits(number / 10);
	}
}
