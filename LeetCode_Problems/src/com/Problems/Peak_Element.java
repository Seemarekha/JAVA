package com.Problems;

public class Peak_Element {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		System.out.println("Peak Element : " + peakElement(arr)); // 3

	}

	private static int peakElement(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int mid = (left + right) / 2;
			if (arr[mid] < arr[mid + 1])
				left = mid + 1;
			else
				right = mid;
		}
		return arr[left];
	}

}
