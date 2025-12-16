/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]


Example 2:

Input: rowIndex = 0
Output: [1]


Example 3:

Input: rowIndex = 1
Output: [1,1]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_II {

	public static void main(String[] args) {
		int rowIndex = 3;
		System.out.println(getRow(rowIndex)); // Output: [1, 3, 3, 1]

	}

	private static List<Integer> getRow(int rowIndex) {
		List<Integer> row = new ArrayList<Integer>();
		long val = 1;

		for (int i = 0; i <= rowIndex; i++) {
			row.add((int) val);

			val = val * (rowIndex - i) / (i + 1);
		}

		return row;
	}

}
