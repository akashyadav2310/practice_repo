package com.logical_practice.recursion;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		sc.close();
		int ans = factorialsUsingRecurssion(input);
		System.out.print(ans);
	}
	//Using recursion
	public static int factorialsUsingRecurssion(int input) {
		if(input <= 1)
			return 1;
		else
			return input * factorialsUsingRecurssion(input - 1);
	}

}
