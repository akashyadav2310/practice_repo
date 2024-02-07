package com.logical_practice.bitwise;

public class PowerOfNumber {

	public static void main(String[] args) {
		int base = 2;
		int power = 5;
		System.out.print(powerOfNum(base, power));

	}
	
	static int powerOfNum(int base, int power) {
		int ans = 1;
		while(power > 0) {
			if((power & 1) == 1)
				ans *= base;
			base = base * base;
			power = power >> 1;
		}
		return ans;
	}

}
