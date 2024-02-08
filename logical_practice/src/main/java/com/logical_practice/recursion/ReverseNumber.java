package com.logical_practice.recursion;

import java.util.Scanner;

public class ReverseNumber {

	static int sum = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		sc.close();
		reverseNumber(input);
		System.out.println("Reverse Number : " +sum);
	}

	public static void reverseNumber(int number) {
		if(number == 0) {
			return;
		}
		int rem = number % 10;
		sum = sum * 10 + rem;
		reverseNumber(number / 10);
	}

}
