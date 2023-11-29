package com.logical_practice.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Fibonacci Series till 10 term
		//2. You want first n numbers of series
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Fibonacci Series till term : ");
		int input = sc.nextInt();
		fibonacci(input);
		nFibonacci(input);
	}

	// Print Fibonacci Series less than the input number
	private static void fibonacci(int input) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		System.out.println("Fibonacci Series less than the "+input);
		System.out.print(f1 + " " + f2);
		while(f3 < input){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			if(f3 <= input)
				System.out.print(" " +f3);
		}
	}
	
	// Print input/n numbers of Fibonacci Series Elements/Numbers
	private static void nFibonacci(int input) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		System.out.println("\nFibonacci Series of "+ input +" elements");
		System.out.print(f1 + " " + f2);
		for(int i = 2; i < input; i++){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.print(" " +f3);
		}
	}
	

}
