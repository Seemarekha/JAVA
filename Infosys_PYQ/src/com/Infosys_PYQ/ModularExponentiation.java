/*
Problem

Compute:

a^b mod m

efficiently.
 */

package com.Infosys_PYQ;

public class ModularExponentiation {

	public static void main(String[] args) {
		System.out.println(power(2, 10, 1000000007));  // 1024

	}

	private static long power(long a, long b, long mod) {
		long res = 1;

		a = a % mod;

		while (b > 0) {
			if ((b & 1) == 1) {
				res = (res * a) % mod;
			}

			a = (a * a) % mod;

			b >>= 1;
		}
		return res;
	}

}
