/*
Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
Substrings that occur multiple times are counted the number of times they occur.

Example 1:

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
Example 2:

Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 */

package com.Problems;

public class Count_Binary_Substrings {

	public static void main(String[] args) {
		System.out.println(countBinarySubstrings("00110011")); // 6
		System.out.println(countBinarySubstrings("10101")); // 4

	}

	private static int countBinarySubstrings(String s) {
		int prev = 0, curr = 1, count = 0;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1))
				curr++;
			else {
				count += Math.min(curr, prev);
				prev = curr;
				curr = 1;
			}
		}
		count += Math.min(curr, prev);
		return count;
	}

}
