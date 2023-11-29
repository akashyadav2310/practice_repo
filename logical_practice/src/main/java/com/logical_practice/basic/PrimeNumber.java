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
		int m = n / 2;
		//int flag = 0;
		
		if(n == 0 || n == 1) {
			return false;
			//System.out.println("Number is not Prime");
			//break;
		}
		else {
			for(int i = 2; i <= m; i++) {
				if(n % i == 0) {
					//flag = 1;
					return true;
					//System.out.println("Number is Prime");
					//break;
				}
			}
		}
		//if(flag == 0)
			//System.out.println("Number is not Prime");
		return false;
	}
	
}
