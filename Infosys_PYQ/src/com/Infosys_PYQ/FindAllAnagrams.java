/*
Problem

Find all starting indices where pattern’s anagram exists.

Example
txt = "cbaebabacd"
pat = "abc"

Output:

[0, 6]

Because:

"cba"
"bac"

are anagrams of "abc".
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";

		System.out.println(findAnagrams(s, p));

	}

	private static List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList<Integer>();

		if (s.length() < p.length())
			return res;

		int[] pFreq = new int[26];
		int[] wFreq = new int[26];

		for (char c : p.toCharArray())
			pFreq[c - 'a']++;

		int k = p.length();

		for (int i = 0; i < s.length(); i++) {
			wFreq[s.charAt(i) - 'a']++;

			if (i >= k)
				wFreq[s.charAt(i - k) - 'a']--;

			if (Arrays.equals(pFreq, wFreq))
				res.add(i - k + 1);
		}
		return res;
	}

}
