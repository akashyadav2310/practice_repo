package com.logical_practice.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		String ans = (isArmStrongNumber(input)) ? "Number is Armstrong" : "Number is not Armstrong";
		System.out.print(ans);
	}

	public static boolean isArmStrongNumber(int input) {
		// TODO Auto-generated method stub
		int n = input;
		int sumOfCubes = 0;
		while(n > 0) {
			int digit = n % 10; 
			sumOfCubes = sumOfCubes + (digit * digit * digit);
			n = n / 10;
		}
		return (input == sumOfCubes) ? true : false;
	}

}
