/*
 In a string s of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".

A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group. In the above example, "xxxx" has the interval [3,6].

A group is considered large if it has 3 or more characters.

Return the intervals of every large group sorted in increasing order by start index.

 
Example 1:

Input: s = "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the only large group with start index 3 and end index 6.
Example 2:

Input: s = "abc"
Output: []
Explanation: We have groups "a", "b", and "c", none of which are large groups.
Example 3:

Input: s = "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
Explanation: The large groups are "ddd", "eeee", and "bbb".

 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Positions_Of_Large_Group {

	public static void main(String[] args) {
		String s1 = "abbxxxxzzy";
		String s2 = "abc";
		String s3 = "abcdddeeeeaabbbcd";

		System.out.println(largeGroupPositions(s1)); // [[3,6]]
		System.out.println(largeGroupPositions(s2)); // []
		System.out.println(largeGroupPositions(s3)); // [[3,5], [6,9], [12,14]]

	}

	private static List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int n = s.length();
		int i = 0;

		while (i < n) {
			int j = i;
			while (j < n && s.charAt(j) == s.charAt(i))
				j++;

			if (j - i >= 3) {
				List<Integer> group = new ArrayList<Integer>();
				group.add(i);
				group.add(j - 1);
				res.add(group);
			}
			i = j;
		}

		return res;
	}

}
