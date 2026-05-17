package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.List;

public class Count_Inversion {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 5, 2, 7 };
		int inversionCount = mergeSort(arr, 0, arr.length - 1);
		System.out.println("Inversion Count : " + inversionCount); // 5

	}

	private static int mergeSort(int[] arr, int st, int end) {
		if (st < end) {
			int mid = st + (end - st) / 2;

			int leftInversionCount = mergeSort(arr, st, mid);
			int rightInversionCount = mergeSort(arr, mid + 1, end);

			int invCount = merge(arr, st, mid, end);

			return leftInversionCount + rightInversionCount + invCount;

		}
		return 0;
	}

	private static int merge(int[] arr, int st, int mid, int end) {
		List<Integer> temp = new ArrayList<>();
		int i = st;
		int j = mid + 1;
		int count = 0;

		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				temp.add(arr[i]);
				i++;
			} else {
				temp.add(arr[j]);
				count += (mid - i + 1);
				j++;

			}
		}

		while (i <= mid) {
			temp.add(arr[i]);
			i++;
		}

		while (j <= end) {
			temp.add(arr[j]);
			j++;
		}

		for (int idx = 0; idx < temp.size(); idx++) {
			arr[idx + st] = temp.get(idx);
		}
		return count;
	}

}
