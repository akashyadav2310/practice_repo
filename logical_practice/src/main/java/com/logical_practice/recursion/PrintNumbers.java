package com.logical_practice.recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		int input = 10;
		print(input);
	}
	
	static void print(int input) {
		System.out.print(input + " ");
		if(input > 1)
			print(input - 1);
	}

}
