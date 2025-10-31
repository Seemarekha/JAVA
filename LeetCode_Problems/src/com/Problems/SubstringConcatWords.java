/*
You are given a string s and an array of strings words. All the strings of words are of the same length.

A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.

For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.

 

Example 1:

Input: s = "barfoothefoobarman", words = ["foo","bar"]

Output: [0,9]

Explanation:

The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.

Example 2:

Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]

Output: []

Explanation:

There is no concatenated substring.

Example 3:

Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]

Output: [6,9,12]

Explanation:

The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"].
The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"].
The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"].
 */

package com.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatWords {

	public static void main(String[] args) {
		System.out.println(findSubstring("barfoothefoobarman", new String[] { "foo", "bar" }));
		// [0, 9]

		System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "word" }));
		// []

		System.out.println(findSubstring("barfoofoobarthefoobarman", new String[] { "bar", "foo", "the" }));
		// [6, 9, 12]

	}

	private static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> result = new ArrayList<>();
		if (s == null || s.isEmpty() || words == null || words.length == 0)
			return result;

		int wordLen = words[0].length();
		int wordCount = words.length;
		int totalLen = wordLen * wordCount;

		if (s.length() < totalLen)
			return result;

		// Step 1: Frequency map of words
		Map	<String, Integer> wordMap = new HashMap<>();
		for (String w : words) {
			wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
		}

		// Step 2: Check for each offset
		for (int i = 0; i < wordLen; i++) {
			int left = i, right = i;
			Map<String, Integer> seen = new HashMap<>();
			int count = 0;

			while (right + wordLen <= s.length()) {
				String word = s.substring(right, right + wordLen);
				right += wordLen;

				if (wordMap.containsKey(word)) {
					seen.put(word, seen.getOrDefault(word, 0) + 1);
					count++;

					// If we have too many of one word, shrink window
					while (seen.get(word) > wordMap.get(word)) {
						String leftWord = s.substring(left, left + wordLen);
						seen.put(leftWord, seen.get(leftWord) - 1);
						left += wordLen;
						count--;
					}

					// If valid concatenation found
					if (count == wordCount) {
						result.add(left);
					}
				} else {
					// Reset when encountering invalid word
					seen.clear();
					count = 0;
					left = right;
				}
			}
		}

		return result;
	}

}
