package com.training.ds;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Graph<T> {
	private Map<T, List<T>> map = new TreeMap<>();

	public void addVertex(T s) {
		map.put(s, new LinkedList<>());
	}

	public void addEdge(T source, T destination, boolean bidirectional) {
		if (!map.containsKey(source)) {
			addVertex(source);
		}
		if (!map.containsKey(destination)) {
			addVertex(destination);
		}

		map.get(source).add(destination);
		if (bidirectional) {
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
