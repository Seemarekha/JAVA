package com.Problems;

public class Rotate_Matrix_90degree_Clockwise {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotate(matrix);

	}

	private static void rotate(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int[] row : matrix) {
			int i = 0, j = n - 1;

			while (i < j) {
				int temp = row[i];
				row[i++] = row[j];
				row[j--] = temp;
			}
		}

		for (int[] temp : matrix) {
			for (int num : temp) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

}


/****************** Output ********************/


/*

i/p :

1 2 3
4 5 6
7 8 9



o/p : 

7 4 1 
8 5 2 
9 6 3 


*/
