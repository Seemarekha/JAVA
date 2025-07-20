/*
 Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.


Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:

Input: s = "Hello"
Output: 1

 */

package com.Problems;

public class Number_of_Segments_in_a_String {

	public static void main(String[] args) {
		System.out.println(countSegments("Hello, my name is John")); // Output: 5
		System.out.println(countSegments("Hello")); // Output: 1
		System.out.println(countSegments("   ")); // Output: 0
		System.out.println(countSegments("  abc   def ")); // Output: 2

	}

	private static int countSegments(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
				count++;
		}
		return count;
	}

}
