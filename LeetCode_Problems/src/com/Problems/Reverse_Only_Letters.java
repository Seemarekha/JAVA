/*
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.


Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

 */

package com.Problems;

public class Reverse_Only_Letters {

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("ab-cd")); // Output: "dc-ba"
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj")); // Output: "j-Ih-gfE-dCba"
		System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!")); // Output: "Qedo1ct-eeLg=ntse-T!"

	}

	private static String reverseOnlyLetters(String s) {
		char[] arr = s.toCharArray();
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			while (left < right && !Character.isLetter(arr[left]))
				left++;

			while (left < right && !Character.isLetter(arr[right]))
				right--;

			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
		return new String(arr);
	}

}
