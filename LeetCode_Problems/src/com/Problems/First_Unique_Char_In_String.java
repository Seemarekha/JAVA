package com.Problems;

public class First_Unique_Char_In_String {

	public static void main(String[] args) {
		String str = "loveleetcode";
		System.out.println("Given string : " + str);
		char res = firstUniqChar(str);
		System.out.println("First unique character in given string : " + res);

	}

	private static char firstUniqChar(String str) {
		int[] freq = new int[26];
		for (char c : str.toCharArray())
			freq[c - 'a']++;
		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i) - 'a'] == 1)
				return str.charAt(i);
		}
		return 0;
	}

}








/**************** Output ********************/

/*


Given string : loveleetcode
First unique character in given string : v




*/