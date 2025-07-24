/*
 You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".


Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

 */
package com.Problems;

import java.util.HashSet;
import java.util.Set;

public class Jewels_And_Stones {

	public static void main(String[] args) {
		String jewels1 = "aA";
		String stones1 = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels1, stones1)); // Output: 3

		String jewels2 = "z";
		String stones2 = "ZZ";
		System.out.println(numJewelsInStones(jewels2, stones2)); // Output: 0

	}

	private static int numJewelsInStones(String jewels, String stones) {
		Set<Character> jewelSet = new HashSet<Character>();
		for (char c : jewels.toCharArray())
			jewelSet.add(c);

		int count = 0;

		for (char c : stones.toCharArray()) {
			if (jewelSet.contains(c))
				count++;
		}
		return count;
	}

}
