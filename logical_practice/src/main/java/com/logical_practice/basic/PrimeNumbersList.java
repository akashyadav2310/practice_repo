package com.logical_practice.basic;

// Print the prime numbers till the given number (optimizing time complexity)
public class PrimeNumbersList {

	public static void main(String[] args) {

		int number = 37;
		boolean[] primes = new boolean[number + 1];
		sieve(number, primes);
	}
	
	static void sieve(int n, boolean[] primes) {
		for(int i = 2; i * i <= n; i++) {
			if(!primes[i]) {
				for(int j = i * 2; j <= n; j+=i) {
					primes[j] = true;
				}
			}
		}
		for(int i = 2; i <= n; i++) {
			if(!primes[i])
				System.out.print(i + " ");
		}
	}

}
