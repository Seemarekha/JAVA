package com.Problems;

import java.util.HashSet;
import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String s = new Scanner(System.in).next();
		System.out.println("Given String : " + s);
		int res = lengthOfLongestSubstring(s);
		System.out.println("Length of longest substring without repeating characters : " + res);

	}

	private static int lengthOfLongestSubstring(String s) {
		HashSet<Character> hs = new HashSet<Character>();
		int left = 0, right = 0, max = 0;
		while (right < s.length()) {
			if (!hs.contains(s.charAt(right))) {
				hs.add(s.charAt(right++));
				max = Math.max(max, hs.size());
			} else {
				hs.remove(s.charAt(left));
				left++;
			}
		}
		return max;
	}

}



/************** Output ******************/


/*



Enter a string : abcabcbb
Given String : abcabcbb
Length of longest substring without repeating characters : 3



*/