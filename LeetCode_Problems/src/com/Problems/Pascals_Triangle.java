/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {

	public static void main(String[] args) {
		int numRows1 = 5;
		int numRows2 = 1;

		System.out.println("Pascal's Triangle (5 rows): " + generate(numRows1));
		System.out.println("Pascal's Triangle (1 row): " + generate(numRows2));

	}

	private static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
					row.add(val);
				}
			}
			triangle.add(row);
		}
		return triangle;
	}

}
