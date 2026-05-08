/*
 You have an array you need to perform the given task: 
 1. If the array length is greater than 1 then take any two numbers which are X!=Y and remove X and Y 
 2. Else take X and remove X Count the minimum number of step to remove all element from the list. 
 
 I/P : 1 2 
 O/P : 1 
 
 I/P : 2 2 
 O/P : 2 
 
 I/P : 2 2 3 3 1 
 O/P : 3
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MinStepsToRemove {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		List<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < n; i++)
			arr.add(scn.nextInt());

		System.out.println(minSteps(arr)); // Output: 3

	}

	private static int minSteps(List<Integer> arr) {
		int n = arr.size();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int maxFreq = 0;

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			maxFreq = Math.max(maxFreq, map.get(num));
		}
		return Math.max(maxFreq, (n + 1) / 2);
	}

}
