/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

 

Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.


Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 9
 */

package com.Infosys_PYQ;

import java.util.Arrays;
import java.util.Scanner;

public class N_Queens_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int ans = totalNQueens(n);  // 4

		System.out.println("Total number of solutions : " + ans);  // 2

	}

	private static int totalNQueens(int n) {
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(board[i], '.');
		}
		return nQueens(board, n, 0);
	}

	private static int nQueens(int[][] board, int n, int row) {
		if (row == n)
			return 1;

		int count = 0;

		for (int col = 0; col < n; col++) {
			if (isSafe(board, row, col, n)) {
				board[row][col] = 'Q';
				count += nQueens(board, n, row + 1);
				board[row][col] = '.';
			}
		}
		return count;
	}

	private static boolean isSafe(int[][] board, int row, int col, int n) {
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 'Q')
				return false;
		}

		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q')
				return false;
		}

		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
			if (board[i][j] == 'Q')
				return false;
		}

		return true;
	}

}
