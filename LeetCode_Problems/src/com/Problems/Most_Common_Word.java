/*
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Note that words can not contain punctuation symbols.
 

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a"

 */

package com.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Most_Common_Word {

	public static void main(String[] args) {
		String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned1 = { "hit" };
		System.out.println(mostCommonWord(paragraph1, banned1)); // Output: "ball"

		String paragraph2 = "a.";
		String[] banned2 = {};
		System.out.println(mostCommonWord(paragraph2, banned2)); // Output: "a"

	}

	private static String mostCommonWord(String paragraph, String[] banned) {
		Set<String> bannedSet = new HashSet<String>(Arrays.asList(banned));

		String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");

		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String word : words) {
			if (!bannedSet.contains(word))
				m.put(word, m.getOrDefault(word, 0) + 1);
		}

		String maxComm = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxComm = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		return maxComm;
	}

}
