package com.training.ds;

public class Node<T> {
	T data;
	Node<T> next;

	public Node(T d) {
		this.data = d;
		next = null;
	}
}
