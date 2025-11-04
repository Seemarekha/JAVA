/*
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.


Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.


Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.

 */

package com.Problems;

public class Long_Pressed_Name {

	public static void main(String[] args) {
		System.out.println(isLongPressedName("alex", "aaleex")); // true
		System.out.println(isLongPressedName("saeed", "ssaaedd")); // false
		System.out.println(isLongPressedName("leelee", "lleeelee")); // true
		System.out.println(isLongPressedName("laiden", "laiden")); // true

	}

	private static boolean isLongPressedName(String name, String typed) {
		int i = 0;

		for (int j = 0; j < typed.length(); j++) {
			if (i < name.length() && name.charAt(i) == typed.charAt(j))
				i++;
			else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
				return false;
		}
		return i == name.length();
	}

}
