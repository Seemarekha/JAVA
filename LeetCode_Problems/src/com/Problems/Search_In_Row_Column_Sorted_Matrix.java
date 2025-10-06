package com.Problems;

public class Search_In_Row_Column_Sorted_Matrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		System.out.println(searchMatrix(matrix, 6)); // true
		System.out.println(searchMatrix(matrix, 10)); // false

	}

	private static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length, cols = matrix[0].length;
		int r = 0, c = cols - 1;

		while (r < rows && c >= 0) {
			if (matrix[r][c] == target)
				return true;
			else if (matrix[r][c] > target)
				c--;
			else
				r++;
		}
		return false;
	}

}
