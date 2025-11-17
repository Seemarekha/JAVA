package com.string_programs;

public class MaximumNumberOfNetworks {

	public static void main(String[] args) {
		int[] speed = { 5, 6, 9, 12, 10, 13 };
		int minComp = 2;
		int speedThreshold = 12;
		int countNetwork = maxNetworks(speed, minComp, speedThreshold);
		System.out.println("Number of network : " + countNetwork); // 2

	}

	private static int maxNetworks(int[] speed, int minComp, int speedThreshold) {
		int n = speed.length;
		int countNetwork = 0;
		int i = 0;
		while (i < n) {
			int sum = 0;
			int numComp = 0;
			boolean isValidNetwork = false;

			for (int j = i; j < n; j++) {
				sum += speed[j];
				numComp++;
				if (numComp >= minComp && sum >= speedThreshold) {
					countNetwork++;
					isValidNetwork = true;
					i = j + 1;
					break;
				}
			}
			if (!isValidNetwork)
				i++;
		}

		return countNetwork;
	}

}
