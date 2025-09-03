/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.


Example 2:

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

 */

package com.Problems;

public class Arranging_Coins {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 8;
		int n3 = 1;

		System.out.println("Input: " + n1 + " -> Output: " + arrangeCoins(n1)); // Input: 5 -> Output: 2
		System.out.println("Input: " + n2 + " -> Output: " + arrangeCoins(n2)); // Input: 8 -> Output: 3
		System.out.println("Input: " + n3 + " -> Output: " + arrangeCoins(n3)); // Input: 1 -> Output: 0

	}

	private static int arrangeCoins(int n) {
		long coins = (long) n;
		long k = (long) (Math.floor((-1 + (Math.sqrt(1 + 8 * coins)) / 2)));
		return (int) k;
	}

}
