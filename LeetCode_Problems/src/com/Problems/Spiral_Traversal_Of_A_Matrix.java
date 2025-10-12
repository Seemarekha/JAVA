package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Traversal_Of_A_Matrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(spiralOrder(matrix));  // [1, 2, 3, 6, 9, 8, 7, 4, 5]
	}

	private static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		int top = 0, bottom = matrix.length - 1;
		int left = 0, right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++)
				res.add(matrix[top][i]);
			top++;

			for (int i = top; i <= bottom; i++)
				res.add(matrix[i][right]);
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--)
					res.add(matrix[bottom][i]);
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--)
					res.add(matrix[i][left]);
				left++;
			}
		}

		return res;
	}

}


/******* Output ***********/

/*


ip : 1 2 3
     4 5 6
     7 8 9
     
op : 1 2 3 6 5 4 7 8 9









*/