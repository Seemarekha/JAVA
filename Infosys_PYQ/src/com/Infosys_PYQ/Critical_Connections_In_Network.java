/*
There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections forming a network 
where connections[i] = [ai, bi] represents a connection between servers ai and bi. Any server can reach other servers directly 
or indirectly through the network.

A critical connection is a connection that, if removed, will make some servers unable to reach some other server.

Return all critical connections in the network in any order.


Example 1:

Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
Explanation: [[3,1]] is also accepted.


Example 2:

Input: n = 2, connections = [[0,1]]
Output: [[0,1]]
 

Constraints:

2 <= n <= 105
n - 1 <= connections.length <= 105
0 <= ai, bi <= n - 1
ai != bi
There are no repeated connections.
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Critical_Connections_In_Network {

	List<List<Integer>> graph = new ArrayList<List<Integer>>();
	List<List<Integer>> result = new ArrayList<List<Integer>>();

	int[] dt;
	int[] low;
	boolean[] vis;
	int time = 0;

	public static void main(String[] args) {
		Critical_Connections_In_Network sol = new Critical_Connections_In_Network();
		int n = 4;

		List<List<Integer>> connections = new ArrayList<>();

		connections.add(Arrays.asList(0, 1));
		connections.add(Arrays.asList(1, 2));
		connections.add(Arrays.asList(2, 0));
		connections.add(Arrays.asList(1, 3));

		List<List<Integer>> ans = sol.criticalConnections(n, connections);

		System.out.println("Critical Connections:");

		for (List<Integer> edge : ans) {
			System.out.println(edge);
		}

	}

	private List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (List<Integer> edge : connections) {
			int u = edge.get(0);
			int v = edge.get(1);

			graph.get(u).add(v);
		}

		dt = new int[n];
		low = new int[n];
		vis = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (!vis[i])
				dfs(i, -1);
		}
		return result;
	}

	private void dfs(int curr, int par) {
		vis[curr] = true;
		dt[curr] = low[curr] = ++time;

		for (int neigh : graph.get(curr)) {
			if (par == neigh)
				continue;

			if (!vis[neigh]) {
				dfs(neigh, curr);
				low[curr] = Math.min(low[curr], low[neigh]);

				if (dt[curr] < low[neigh])
					result.add(Arrays.asList(curr, neigh));
			} else {
				low[curr] = Math.min(low[curr], dt[neigh]);
			}
		}

	}

}
