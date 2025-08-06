 package com.CodesForRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NthRowOfPascalsTriangle {

	public static void main(String[] args) {
		System.out.print("Enter number of row :");
		int n = new Scanner(System.in).nextInt();

		List<Integer> nthRow = getRow(n);

		System.out.println(n+"th row of Pascal Triangle :"+nthRow);
	}

	private static List<Integer> getRow(int n) {
		List<Integer> r = new ArrayList<Integer>();
		r.add(1);

		for (int i = 1; i <= n; i++) {
			int prev = r.get(i - 1);
			int next = (int) ((long) prev * (n - i + 1) / i);
			r.add(next);
		}
		return r;
	}

}






/******************* Output **********************/

/*


Enter number of row :5
5th row of Pascal Triangle :[1, 5, 10, 10, 5, 1]





*/


