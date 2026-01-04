/*
A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
 

Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]


Example 2:

Input: s = "III"
Output: [0,1,2,3]


Example 3:

Input: s = "DDI"
Output: [3,2,0,1]

 */

package com.Problems;

import java.util.Arrays;

public class DI_String_Match {

	public static void main(String[] args) {
		String s1 = "IDID";
		String s2 = "III";
		String s3 = "DDI";

		System.out.println(Arrays.toString(diStringMatch(s1))); // Output: [0, 4, 1, 3, 2]
		System.out.println(Arrays.toString(diStringMatch(s2))); // Output: [0, 1, 2, 3]
		System.out.println(Arrays.toString(diStringMatch(s3))); // Output: [3, 2, 0, 1]

	}

	private static int[] diStringMatch(String s) {
		int n = s.length();
		int[] res = new int[n + 1];
		int low = 0, high = n;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I')
				res[i] = low++;
			else
				res[i] = high--;

		}
		res[n] = low;

		return res;
	}

}
