/*
Given an integer n, return the number of prime numbers that are strictly less than n.
 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.


Example 2:

Input: n = 0
Output: 0


Example 3:

Input: n = 1
Output: 0
 */

package com.Problems;


public class Count_Primes {

	public static void main(String[] args) {

		int n = 10;
		System.out.println("Number of primes less than " + n + " = " + countPrimes(n)); // 4

		n = 15;
		System.out.println("Number of primes less than " + n + " = " + countPrimes(n)); // 6

		n = 1;
		System.out.println("Number of primes less than " + n + " = " + countPrimes(n)); // 0

	}

	private static int countPrimes(int n) {
//		if (n <= 2)
//			return 0;
//
//		boolean[] isPrime = new boolean[n];
//		Arrays.fill(isPrime, true);
//		isPrime[0] = isPrime[1] = false;
//
//		for (int i = 2; i * i < n; i++) {
//			if (isPrime[i]) {
//				for (int j = i * i; j < n; j += i) {
//					isPrime[j] = false;
//				}
//			}
//		}
//
//		int count = 0;
//		for (boolean prime : isPrime) {
//			if (prime)
//				count++;
//		}
//
//		return count;
		
		if(n<2) return 0;
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(isPrime(i,i/2))
				count++;
		}
		return count;
	}

	private static boolean isPrime(int n,int i) {
		if(n<=1) return false;
		if(i==1)
			return true;
		if(n%i==0) return false;
		return isPrime(n,i-1);
	}

}
