/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1
 */

package com.Problems;

public class Hamming_Distance {

	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4)); // 2
		System.out.println(hammingDistance(3, 1)); // 1

	}

	private static int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int count = 0;

		while (xor != 0) {
			count += (xor & 1);
			xor >>= 1;
		}
		return count;
	}

}
