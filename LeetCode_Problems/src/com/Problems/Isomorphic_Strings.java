package com.Problems;

import java.util.HashMap;

public class Isomorphic_Strings {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add")); // true
		System.out.println(isIsomorphic("foo", "bar")); // false
		System.out.println(isIsomorphic("paper", "title")); // true
		System.out.println(isIsomorphic("ab", "aa")); // false

	}

	private static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;

		HashMap<Character, Character> mapST = new HashMap<Character, Character>();
		HashMap<Character, Character> mapTS = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);

			if (mapST.containsKey(cs)) {
				if (mapST.get(cs) != ct)
					return false;
			} else {
				mapST.put(cs, ct);
			}

			if (mapTS.containsKey(ct)) {
				if (mapTS.get(ct) != cs)
					return false;
			} else {
				mapTS.put(ct, cs);
			}
		}
		return true;
	}

}
