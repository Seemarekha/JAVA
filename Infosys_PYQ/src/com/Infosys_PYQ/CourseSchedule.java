/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

 

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.


Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 

Constraints:

1 <= numCourses <= 2000
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
 */

package com.Infosys_PYQ;

public class CourseSchedule {

	public static void main(String[] args) {

		int numCourses = 2;

		int[][] prerequisites = { { 1, 0 } };

		System.out.println(canFinish(numCourses, prerequisites)); // true
	}

	private static boolean canFinish(int numCourses, int[][] prerequisites) {
		boolean[] vis = new boolean[numCourses];
		boolean[] rec = new boolean[numCourses];

		for (int i = 0; i < prerequisites.length; i++) {
			if (!vis[i]) {
				if (iscycleDfs(i, vis, rec, prerequisites)) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean iscycleDfs(int src, boolean[] vis, boolean[] rec, int[][] prerequisites) {
		vis[src] = true;
		rec[src] = true;

		for (int i = 0; i < prerequisites.length; i++) {
			int v = prerequisites[i][0];
			int u = prerequisites[i][1];

			if (u == src) {
				if (!vis[v]) {
					if (iscycleDfs(v, vis, rec, prerequisites))
						return true;
				} else if (rec[v])
					return true;
			}
		}
		rec[src] = false;
		return false;
	}

}
