package com.Problems;

public class Word_Search {

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";

		System.out.println("Word exists: " + exist(board, word)); // true

	}

	private static boolean exist(char[][] board, String word) {
		int rows = board.length;
		int cols = board[0].length;

		boolean[][] isVisited = new boolean[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (dfs(board, word, 0, i, j, isVisited))
					return true;
			}
		}
		return false;
	}

	private static boolean dfs(char[][] board, String word, int idx, int i, int j, boolean[][] isVisited) {
		if (idx == board.length)
			return true;
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
			return false;

		isVisited[i][j] = true;

		boolean found = dfs(board, word, idx + 1, i + 1, j, isVisited) || dfs(board, word, idx + 1, i - 1, j, isVisited)
				|| dfs(board, word, idx + 1, i, j + 1, isVisited) || dfs(board, word, idx + 1, i, j - 1, isVisited);

		isVisited[i][j] = false;
		return found;
	}

}
