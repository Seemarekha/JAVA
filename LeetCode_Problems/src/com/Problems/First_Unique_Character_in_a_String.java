package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(firstUniqChar(s)); // Output: 0

	}

	private static int firstUniqChar(String s) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (m.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}

}
