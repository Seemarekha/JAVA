/*
 
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.


Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

 */

package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abccccdd")); // Output: 7 ("dccaccd" or "dccbccd")
		System.out.println(longestPalindrome("a")); // Output: 1

	}

	private static int longestPalindrome(String s) {
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (char c : s.toCharArray())
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);

		int maxLength = 0;
		boolean hasOdd = false;

		for (int count : countMap.values()) {
			maxLength += (count / 2) * 2;
			if (count % 2 == 1)
				hasOdd = true;
		}
		if (hasOdd)
			maxLength += 1;

		return maxLength;
	}

}
