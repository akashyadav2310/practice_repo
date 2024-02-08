package com.logical_practice.recursion;

import java.util.Scanner;

public class CountZerosOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = sc.nextInt();
		sc.close();
		int ans = countZeros(input, 0);
		System.out.print(ans);
	}
	
	static int countZeros(int n, int cnt) {
		if(n == 0)
			return cnt;
		if(n % 10 == 0)
			return countZeros(n / 10, ++cnt);
		else {
			return countZeros(n / 10, cnt);
		}
	}
	
}
