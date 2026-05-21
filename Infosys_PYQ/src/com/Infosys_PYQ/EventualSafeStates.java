/*
A node is a terminal node if there are no outgoing edges. A node is a safe node if every possible path starting from that 
node leads to a terminal node (or another safe node).

Return an array containing all the safe nodes of the graph. The answer should be sorted in ascending order.

 

Example 1:

Illustration of graph
Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2,4,5,6]
Explanation: The given graph is shown above.
Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either of them.
Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.


Example 2:

Input: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
Output: [4]
Explanation:
Only node 4 is a terminal node, and every path starting at node 4 leads to node 4.
 

Constraints:

n == graph.length
1 <= n <= 104
0 <= graph[i].length <= n
0 <= graph[i][j] <= n - 1
graph[i] is sorted in a strictly increasing order.
The graph may contain self-loops.
The number of edges in the graph will be in the range [1, 4 * 104].
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EventualSafeStates {

	public static void main(String[] args) {
		int[][] graph = { { 1, 2 }, { 2, 3 }, { 5 }, { 0 }, { 5 }, {}, {} };

		System.out.println(eventualSafeNodes(graph));

	}

	private static List<Integer> eventualSafeNodes(int[][] graph) {
		int n = graph.length;

		List<List<Integer>> revGraph = new ArrayList<List<Integer>>();
		int[] outDegree = new int[n];

		for (int i = 0; i < n; i++) {
			revGraph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n; i++) {
			outDegree[i] = graph[i].length;

			for (int neighbor : graph[i]) {
				revGraph.get(neighbor).add(i);
			}
		}

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			if (outDegree[i] == 0)
				q.offer(i);
		}

		boolean[] safe = new boolean[n];
		while (!q.isEmpty()) {
			int curr = q.poll();
			safe[curr] = true;

			for (int prev : revGraph.get(curr)) {
				outDegree[prev]--;

				if (outDegree[prev] == 0)
					q.offer(prev);
			}
		}

		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (safe[i])
				res.add(i);
		}
		return res;
	}

}
