package com.training.ui;

import com.training.ds.Graph;

public class Main01 {
	public static void main(String[] args) {
		Graph<String> graph = new Graph<>();
		graph.addVertex("Karthick");
		graph.addEdge("Karthick", "Dinesh", false);
		graph.addEdge("Karthick", "Mamta", false);
		graph.addEdge("Mamta", "Dinesh", true);
		graph.addEdge("Usha", "Vani", true);
		System.out.println(graph.toString());
	}
}
