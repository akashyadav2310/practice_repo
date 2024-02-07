package com.logical_practice.basic;

// Formula of GCD (HCF) and LCM
// GCD * LCM = a * b
public class GCD_LCM {

	public static void main(String[] args) {
		int a = 15;
		int b = 40;
		int gcd = gcd(a, b);
		System.out.println("GCD of the " +a + " & " + b +" is : " +gcd);
		int lcm = lcm(a, b);
		System.out.println("LCM of the " +a + " & " + b +" is : " +lcm);
	}
	
	static int gcd(int a, int b) {
		if(a == 0)
			return b;
		return gcd(b % a, a);
	}
	
	static int lcm(int a, int b) {
		int gcd = gcd(a, b);
		return (a * b) / gcd; // As per formula : GCD * LCM = a * b
	}

}
