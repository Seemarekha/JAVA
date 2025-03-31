package com.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Contains_Duplicates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter length of an array :");
		int len = scn.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements into the array");
		for (int i = 0; i < len; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Given array :" + Arrays.toString(arr));

		if (containsDuplicates(arr))
			System.out.println("Array contains duplicate elements");
		else
			System.out.println("Array doesn't contains any duplicate elements");

	}

	private static boolean containsDuplicates(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i]))
				return true;
			set.add(arr[i]);
		}

		return false;
	}

}



/************ Output ***************/

/*


Enter length of an array :5
Enter elements into the array
3
2
5
1
2
Given array :[3, 2, 5, 1, 2]
Array contains duplicate elements
 
 */
