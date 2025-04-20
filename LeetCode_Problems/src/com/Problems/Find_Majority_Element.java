package com.Problems;

public class Find_Majority_Element {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 2, 3, 2, 2 };
		System.out.println("Majority element : " + findMajority(arr));

	}

	private static int findMajority(int[] arr) {
		int count = 0, candidate = -1;

		for (int n : arr) {
			if (count == 0)
				candidate = n;
			count += (n == candidate) ? 1 : -1;
		}
		count = 0;
		for (int n : arr) {
			if (n == candidate)
				count++;
		}
		return (count > arr.length / 2) ? candidate : -1;
		
	}

}




/******************** Output ****************/

/*

Majority element : 2


*/