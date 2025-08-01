package com.Problems;

public class Reverse_String {

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);
		System.out.println(s); // Output: "olleh"

	}

	private static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;
		}

	}

}
