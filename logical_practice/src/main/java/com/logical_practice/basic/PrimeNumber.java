package com.logical_practice.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		if(isPrime(input))
			System.out.println("Number is Prime");
		else
			System.out.println("Number not is Prime");
			
	}

	private static boolean isPrime(int input) {
//		int bar = input / 2;
//		int i = 2;
//		while(i <= bar + 1) {
//			if(input / i != 0)
//				return true;
//			i++;
//		}
//		return false;
	
		int n = input;
		if(n <= 1)
			return false;
		int k = 2;
		while(k * k <= n) {
			if(n % k == 0)
				return false;
			k++;
		}
		return true;
	}
	
	
}
