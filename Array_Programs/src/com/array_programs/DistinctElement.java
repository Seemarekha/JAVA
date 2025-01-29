package com.array_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter target value :");
		int target = scn.nextInt();
		System.out.println("Enter size of array :");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		int count = 0;
		for (int num : arr) {
			if (m.containsKey(num - target)) {
				count += m.get(num - target);
			}
			if (m.containsKey(num + target)) {
				count += m.get(num + target);
			}
			m.put(num, m.getOrDefault(num, 0) + 1);
		}
		System.out.println("Number of distinct pairs :" + count);
	}

}
