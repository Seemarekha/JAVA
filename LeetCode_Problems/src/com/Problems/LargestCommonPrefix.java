package com.Problems;

import java.util.Arrays;

public class LargestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "flower", "flow", "flight" };
		System.out.println("Given string array : " + Arrays.toString(arr));
		System.out.println("Largest common prefix : " + largestCommonPrefix(arr));

	}

	private static String largestCommonPrefix(String[] arr) {

		if (arr == null || arr.length == 0)
			return "";

		String prefix = arr[0];
		for (int i = 1; i < arr.length; i++) {
			while (!arr[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}

}





/****************** Output *****************/

/*



Given string array : [flower, flow, flight]
Largest common prefix : fl



*/