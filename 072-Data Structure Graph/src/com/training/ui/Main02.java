package com.training.ui;

import com.training.ds.Graph;
import com.training.model.Employee;

public class Main02 {
	public static void main(String[] args) {
		Graph<Employee> employeeGraph = new Graph<>();
		Employee e1 = new Employee(101, "Manju", "Female", "Kochi", 10000.00);
		Employee e2 = new Employee(102, "Arun", "Male", "TVM", 5000.00);
		Employee e3 = new Employee(103, "Renju", "Female", "Pune", 50000.00);
		Employee e4 = new Employee(104, "Niyas", "Male", "Hyderbad", 25000.00);
		Employee e5 = new Employee(105, "Rehan", "Male", "Delhi", 15000.00);
		employeeGraph.addVertex(e1);
		employeeGraph.addVertex(e2);
		employeeGraph.addVertex(e3);
		employeeGraph.addVertex(e4);
		employeeGraph.addEdge(e1, e2, false);
		employeeGraph.addEdge(e1, e5, false);
		employeeGraph.addEdge(e4, e3, true);
		employeeGraph.addEdge(e4, e5, false);
		employeeGraph.addEdge(e5, e2, true);
		employeeGraph.addEdge(e3, e2, false);
		System.out.println(employeeGraph.toString());
	}
}
