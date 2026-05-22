/*
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome 
partitioning of s.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]


Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		String s = "aab";
		List<List<String>> res = partition(s);
		System.out.println(res);  // [[a, a, b], [aa, b]]
	}

	private static List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> parts = new ArrayList<String>();
		getAllParts(s, parts, res);
		return res; 
	}

	private static void getAllParts(String s, List<String> parts, List<List<String>> res) {
		if (s.length() == 0) {
			res.add(new ArrayList<String>(parts));
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			String part = s.substring(0, i + 1);
			if (isPalindrome(part)) {
				parts.add(part);
				getAllParts(s.substring(i + 1), parts, res);
				parts.remove(parts.size() - 1);
			}
		}

	}

	private static boolean isPalindrome(String part) {
		int i = 0, j = part.length() - 1;

		while (i < j) {
			if (part.charAt(i) != part.charAt(j))
				return false;
			i++;
			j--;

		}
		return true;
	}

}
