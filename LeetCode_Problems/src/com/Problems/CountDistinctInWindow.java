/*
Example

Input:
arr = [1, 2, 1, 3, 4, 2, 3], k = 4

Windows:

[1, 2, 1, 3] → 3 distinct

[2, 1, 3, 4] → 4 distinct

[1, 3, 4, 2] → 4 distinct

[3, 4, 2, 3] → 3 distinct

Output:
3 4 4 3

 */

package com.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinctInWindow {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
		int k = 4;

		List<Integer> res = countDistinct(arr, k);
		System.out.println(res); // [3, 4, 4, 3]

	}

	private static List<Integer> countDistinct(int[] arr, int k) {
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = arr.length;

		for (int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		res.add(map.size());

		for (int i = k; i < n; i++) {
			int outgoing = arr[i - k];

			map.put(outgoing, map.get(outgoing) - 1);

			if (map.get(outgoing) == 0)
				map.remove(outgoing);

			int incoming = arr[i];
			map.put(incoming, map.getOrDefault(incoming, 0) + 1);

			res.add(map.size());
		}

		return res;
	}

}
