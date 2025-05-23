package com.training.ui;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Graph<T> {
	private Map<T, List<T>> map = new TreeMap<>();

	public void addVertex(T s) {
		map.put(s, new LinkedList<>());
	}

	public List<T> getRelations(T source) {
		return map.get(source);
	}

	public void addEdge(T source, T destination, boolean bidirectional) {
		if (!map.containsKey(source)) {
			addVertex(source);
		}
		if (!map.containsKey(destination)) {
			addVertex(destination);
		}
		if (map.get(source) != null) {

		}
		map.get(source).add(destination);
		if (bidirectional && map.get(destination) != null) {
			map.get(destination).add(source);
		}

	}

	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (T v : map.keySet()) {
			builder.append(v.toString() + " : ");
			for (T w : map.get(v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}

		return builder.toString();
	}
}

public class Main {

	public static void main(String[] args) {
		int N = 5;
		int M = 4;
		int[][] a = { { 1, 4 }, { 1, 3 }, { 1, 2 }, { 2, 4 } };
		int q = 5;
		int[] Queries = { 1, 2, 3, 4, 5 };
		int result[][] = solve(N, M, a, q, Queries);
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static int[][] solve(int N, int M, int[][] a, int q, int[] Queries) {
		Graph<Integer> graph = new Graph<>();
		for (int i = 0; i < a.length; i++) {
				graph.addEdge(a[i][0], a[i][1], true);
			
		}
		int [] [] result = new int[q][];
		for(int i =0;i<q;i++) {;
			int key=Queries[i];
			List<Integer> list=graph.getRelations(key);
			if(list !=null) {
				Collections.sort(list);
				result[i]=new int[list.size()];
				for(int z=0;z<result[i].length;z++) {
					result[i][z]=list.get(z);
				}
			}
			else {
				result[i]= new int[] {-1};
			}
		}
		return result;
	}
}
