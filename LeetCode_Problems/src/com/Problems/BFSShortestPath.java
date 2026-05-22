package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSShortestPath {

	public static void main(String[] args) {
		int V = 6;
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<Integer>());
		}

		graph.get(0).add(1);
		graph.get(0).add(2);
		graph.get(1).add(3);
		graph.get(2).add(3);
		graph.get(3).add(4);
		graph.get(4).add(5);

		int source = 0;

		bfsShortestPath(graph, source, V);

	}

	private static void bfsShortestPath(List<List<Integer>> graph, int src, int v) {
		int[] dist = new int[v];
		Arrays.fill(dist, -1);

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(src);

		dist[src] = 0;

		while (!q.isEmpty()) {
			int node = q.poll();

			for (int neighbour : graph.get(node)) {
				if (dist[neighbour] == -1) {
					dist[neighbour] = dist[node] + 1;
					q.offer(neighbour);
				}
			}
		}

		for (int i = 0; i < v; i++) {
			System.out.println("Distance from " + src + " to " + i + " = " + dist[i]);
		}

	}

}


/*
 
Example Graph

0 -- 1
|    |
2 -- 3 -- 4 -- 5


Output (from source = 0):

Distance from 0 to 0 = 0
Distance from 0 to 1 = 1
Distance from 0 to 2 = 1
Distance from 0 to 3 = 2
Distance from 0 to 4 = 3
Distance from 0 to 5 = 4
 
 */
