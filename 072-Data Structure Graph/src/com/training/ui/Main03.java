package com.training.ui;

import com.training.ds.Graph;
import com.training.model.Account;

public class Main03 {
	public static void main(String[] args) {
		Graph<Account> accGraph = new Graph<>();

		Account acc1 = new Account("Anu Alias", 100000.0);
		Account acc2 = new Account("Renju PV", 200000.0);
		Account acc3 = new Account("Lia Thomas", 500000.0);
		Account acc4 = new Account("Meera Mathew", 300000.0);
		Account acc5 = new Account("Anju Sebastian", 400000.0);

		accGraph.addVertex(acc1);
		accGraph.addVertex(acc2);
		accGraph.addVertex(acc3);
		accGraph.addVertex(acc5);

		accGraph.addEdge(acc1, acc2, false);
		accGraph.addEdge(acc2, acc4, false);
		accGraph.addEdge(acc2, acc3, true);
		accGraph.addEdge(acc3, acc4, false);
		accGraph.addEdge(acc4, acc5, true);
		accGraph.addEdge(acc3, acc1, true);
		accGraph.addEdge(acc1, acc4, true);

		System.out.println(accGraph.toString());
	}
}
