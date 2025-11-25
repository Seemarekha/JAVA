/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Explanation:
P   A   H   N
A P L S I I G
Y   I   R


Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I


Example 3:

Input: s = "A", numRows = 1
Output: "A"
 */

package com.Problems;

public class ZigZag_Conversion {

	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3)); // Output: PAHNAPLSIIGYIR
		System.out.println(convert("PAYPALISHIRING", 4)); // Output: PINALSIGYAHRPI
		System.out.println(convert("A", 1)); // Output: A

	}

	private static String convert(String s, int numRows) {
		if (numRows == 0 || s.length() <= numRows)
			return s;

		StringBuilder[] rows = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++) {
			rows[i] = new StringBuilder();
		}

		int index = 0;
		boolean goingDown = false;

		for (char c : s.toCharArray()) {
			rows[index].append(c);

			if (index == 0 || index == numRows - 1)
				goingDown = !goingDown;

			index += goingDown ? 1 : -1;
		}

		StringBuilder res = new StringBuilder();
		for (StringBuilder row : rows) {
			res.append(row);
		}
		return res.toString();
	}

}
