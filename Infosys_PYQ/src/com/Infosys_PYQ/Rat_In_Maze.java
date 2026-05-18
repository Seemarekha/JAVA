package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.List;

public class Rat_In_Maze {

	public static void main(String[] args) {
		int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };

		int n = maze.length;

		List<String> ans = findPath(maze, n);

		System.out.println(ans); // [DDRDRR, DRDDRR]

	}

	private static List<String> findPath(int[][] maze, int n) {
		List<String> ans = new ArrayList<String>();
		String path = "";
		helper(maze, 0, 0, path, ans, n);
		return ans;
	}

	private static void helper(int[][] maze, int r, int c, String path, List<String> ans, int n) {

		if (r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c]==-1)
			return;

		if (r == n - 1 && c == n - 1) {
			ans.add(path);
			return;
		}
		maze[r][c] = -1;
		helper(maze, r + 1, c, path + "D", ans, n);
		helper(maze, r - 1, c, path + "U", ans, n);
		helper(maze, r, c + 1, path + "R", ans, n);
		helper(maze, r, c - 1, path + "L", ans, n);

		maze[r][c] = 1;
	}

}
