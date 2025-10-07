package com.Problems;

public class String_Permutation {

	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("Permutations of " + s + ":");
		permute(s, "");

	}

	private static void permute(String s, String ans) {
		if (s.isEmpty()) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String ros = s.substring(0, i) + s.substring(i + 1);
			permute(ros, ans + c);
		}

	}

}


/*

Permutations of ABC:
ABC
ACB
BAC
BCA
CAB
CBA

*/