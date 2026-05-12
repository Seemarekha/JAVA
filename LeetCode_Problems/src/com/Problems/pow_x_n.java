/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000


Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100


Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */

package com.Problems;

public class pow_x_n {

	public static void main(String[] args) {
		System.out.println(myPow(2.0, 10)); // 1024.0
		System.out.println(myPow(2.1, 3)); // 9.261
		System.out.println(myPow(2.0, -2)); // 0.25

	}

	private static double myPow(double x, int n) {
		long N = n;

		if (N < 0) {
			x = 1 / x;
			N = -N;
		}

		double res = 1.0;

		while (N > 0) {
			if ((N & 1) == 1)
				res *= x;

			x *= x;
			N >>= 1;
		}

		return res;
	}

}
