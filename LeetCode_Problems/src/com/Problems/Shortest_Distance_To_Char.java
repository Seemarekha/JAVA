/*
Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.


Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.


Example 2:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]

 */

package com.Problems;

import java.util.Arrays;

public class Shortest_Distance_To_Char {

	public static void main(String[] args) {
		String s1 = "loveleetcode";
		char c1 = 'e';
		System.out.println(Arrays.toString(shortestToChar(s1, c1))); // [3,2,1,0,1,0,0,1,2,2,1,0]

		String s2 = "aaab";
		char c2 = 'b';
		System.out.println(Arrays.toString(shortestToChar(s2, c2))); // [3,2,1,0]

	}

	private static int[] shortestToChar(String s, char c) {
		int n = s.length();
		int[] res = new int[n];
		int prev = Integer.MIN_VALUE / 2;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == c)
				prev = i;
			res[i] = i - prev;
		}

		prev = Integer.MAX_VALUE / 2;
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == c)
				prev = i;
			res[i] = Math.min(res[i], prev - i);
		}
		return res;
	}

}
