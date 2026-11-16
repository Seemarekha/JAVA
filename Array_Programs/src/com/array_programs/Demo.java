package com.array_programs;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		String s = "ABbcaDdeff";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i=0;i<s.length();i++) {
			char c=Character.toLowerCase(s.charAt(i));
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			char c = Character.toLowerCase(s.charAt(i));

			if (map.get(c) == 1) {
				System.out.println(s.charAt(i));
				break;
			}
		}

	}

}
