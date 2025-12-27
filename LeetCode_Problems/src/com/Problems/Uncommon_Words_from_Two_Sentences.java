/*
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.


Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Explanation:
The word "sweet" appears only in s1, while the word "sour" appears only in s2.


Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Uncommon_Words_from_Two_Sentences {

	public static void main(String[] args) {
		String[] res1 = uncommonFromSentences("this apple is sweet", "this apple is sour");
		System.out.println(Arrays.toString(res1)); // [sweet, sour]

		String[] res2 = uncommonFromSentences("apple apple", "banana");
		System.out.println(Arrays.toString(res2)); // [banana]

	}

	private static String[] uncommonFromSentences(String s1, String s2) {

		String combined = s1 + " " + s2;
		String[] words = combined.split(" ");

		Map<String, Integer> freq = new HashMap<String, Integer>();
		for (String word : words) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}

		List<String> res = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : freq.entrySet()) {
			if (entry.getValue() == 1)
				res.add(entry.getKey());
		}
		return res.toArray(new String[0]);
	}

}
