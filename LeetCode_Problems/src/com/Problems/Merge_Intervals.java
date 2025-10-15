/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].


Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.
 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {

	public static void main(String[] args) {
		int[][] intervals1 = { { 1, 3 }, { 2, 6  }, { 8, 10 }, { 15, 18 } };
		int[][] intervals2 = { { 1, 4 }, { 4, 5 } };
		int[][] intervals3 = { { 4, 7 }, { 1, 4 } };

		System.out.println(Arrays.deepToString(merge(intervals1))); // [[1, 6], [8, 10], [15, 18]]
		System.out.println(Arrays.deepToString(merge(intervals2))); // [[1, 5]]
		System.out.println(Arrays.deepToString(merge(intervals3))); // [[1, 7]]

	}

	private static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		List<int[]> res = new ArrayList<int[]>();

		int[] curr = intervals[0];
		res.add(curr);

		for (int[] interval : intervals) {
			if (interval[0] <= curr[1]) {
				curr[1] = Math.max(curr[1], interval[1]);
			} else {
				curr = interval;
				res.add(curr);
			}
		}
		return res.toArray(new int[res.size()][]);
	}

}
