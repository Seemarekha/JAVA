/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.


Example 2:

Input: strs = [""]

Output: [[""]]


Example 3:

Input: strs = ["a"]

Output: [["a"]]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {

	public static void main(String[] args) {
		String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
		String[] strs2 = { "" };
		String[] strs3 = { "a" };

		System.out.println(groupAnagrams(strs1));
		// Output: [[bat], [nat, tan], [eat, tea, ate]]

		System.out.println(groupAnagrams(strs2));
		// Output: [[""]]

		System.out.println(groupAnagrams(strs3));
		// Output: [["a"]]

	}

	private static List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0)
			return new ArrayList<List<String>>();

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for (String str : strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(str);
		}
		return new ArrayList<List<String>>(map.values());
	}

}
