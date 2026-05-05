/*
You are given a string consisting of lowercase characters only. 
The letters can be duplicate or nun-duplicate. 

Duplicate letters have multiple copies present in the string, 
where the non-duplicates are unique and occur once. 

Your task is to return index of the first non-duplicate letter present in the string if we traverse it from left to right. 
Use the indexing starting from 1. 
If no such letter is present return -1. 

Constraints: 1<=length of the string <= 10^5 

I/P : statistics 
O/P : 3

I/P : hackthegame 
O/P : 3
 */

package com.Infosys_PYQ;

import java.util.Scanner;

public class FirstNonDuplicate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a string value : ");
		String s = scn.next();

		System.out.println("First unique character : " + firstUniqueChar(s));

	}

	private static int firstUniqueChar(String s) {
		int n = s.length();
		int[] freq = new int[26];

		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}

		for (int i = 0; i < n; i++) {
			if (freq[s.charAt(i) - 'a'] == 1)
				return i + 1;
		}
		return -1;
	}

}
