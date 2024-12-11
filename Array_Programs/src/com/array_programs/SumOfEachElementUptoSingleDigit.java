package com.array_programs;

public class SumOfEachElementUptoSingleDigit {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 8, 9, 6, 7, 4, 5, 6, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		//System.out.println(sum);
		do {
			int n = sum;
			sum = 0;
			while (n > 0) {
				int r = n % 10;
				sum += r;
				n /= 10;
			}
		} while (sum > 9);
		System.out.println("Sum of each element present in array upto single digit : " + sum);

	}

}
