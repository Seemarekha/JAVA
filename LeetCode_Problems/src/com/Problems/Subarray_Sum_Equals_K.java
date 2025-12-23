package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int k = 3;
		int res = subarraySum(arr, k);
		System.out.println(res); // 2

	}
 
	private static int subarraySum(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);

		int sum = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

}
