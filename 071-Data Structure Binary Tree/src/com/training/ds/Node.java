package com.training.ds;

public class Node<T> {
	T key;
	Node<T> left;
	Node<T> right;

	public Node(T item) {
		key = item;
		left = right = null;
	}
}
