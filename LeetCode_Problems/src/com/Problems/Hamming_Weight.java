/*
Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 
Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

 */

package com.Problems;

public class Hamming_Weight {

	public static void main(String[] args) {
		Hamming_Weight hw = new Hamming_Weight();

		int n1 = 11;
		int n2 = 128;
		int n3 = 2147483645;

		System.out.println(
				"Input: " + n1 + " -> Binary: " + toBinaryString(n1) + " -> Set Bits: " + hw.hammingWeight(n1));
		System.out.println(
				"Input: " + n2 + " -> Binary: " + toBinaryString(n2) + " -> Set Bits: " + hw.hammingWeight(n2));
		System.out.println(
				"Input: " + n3 + " -> Binary: " + toBinaryString(n3) + " -> Set Bits: " + hw.hammingWeight(n3));

	}

	private int hammingWeight(int n) {
		int count = 0;

		while (n != 0) {
			count += (n & 1);
			n >>>= 1;
		}
		return count;
	}

	private static String toBinaryString(int n) {

		return String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
	}

}

/******************* Output ************************/

/*
 * 
 * 
 * 
 * Input: 11 -> Binary: 00000000000000000000000000001011 -> Set Bits: 3 
 * Input: 128 -> Binary: 00000000000000000000000010000000 -> Set Bits: 1 
 * Input: 2147483645 -> Binary: 01111111111111111111111111111101 -> Set Bits: 30
 * 
 * 
 * 
 * 
 * 
 */
