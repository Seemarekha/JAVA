/*
 Given two arrays of strings list1 and list2, find the common strings with the least index sum.

A common string is a string that appeared in both list1 and list2.

A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

Return all the common strings with the least index sum. Return the answer in any order.


Example 1:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only common string is "Shogun".
Example 2:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
Example 3:

Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
Output: ["sad","happy"]
Explanation: There are three common strings:
"happy" with index sum = (0 + 1) = 1.
"sad" with index sum = (1 + 0) = 1.
"good" with index sum = (2 + 2) = 4.
The strings with the least index sum are "sad" and "happy".
 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Minimum_Index_Sum_of_Two_Lists {

	public static void main(String[] args) {
		String[] list1a = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2a = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };

		String[] list1b = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2b = { "KFC", "Shogun", "Burger King" };

		String[] list1c = { "happy", "sad", "good" };
		String[] list2c = { "sad", "happy", "good" };

		System.out.println(Arrays.toString(findRestaurant(list1a, list2a))); // ["Shogun"]
		System.out.println(Arrays.toString(findRestaurant(list1b, list2b))); // ["Shogun"]
		System.out.println(Arrays.toString(findRestaurant(list1c, list2c))); // ["sad", "happy"]

	}

	private static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> res = new ArrayList<String>();
		int minSum = Integer.MAX_VALUE;

		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}

		for (int j = 0; j < list2.length; j++) {
			String word = list2[j];

			if (map.containsKey(word)) {
				int sum = j + map.get(word);

				if (sum < minSum) {
					res.clear();
					res.add(word);
					minSum = sum;
				} else if (sum == minSum)
					res.add(word);
			}
		}
		return res.toArray(new String[0]);
	}

}
