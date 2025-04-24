package com.training.linkedlist;



public class LinkedList<T> {
	public static Node start = null;

	public void addToList(T data) {
		Node<T> new_node = new Node<T>(data);
		new_node.nextNode = null;

		if (start == null) {
			start = new_node;
		} else {
			Node<T> current = start;
			while (current.nextNode != null) {
				current = current.nextNode;
			}

			current.nextNode = new_node;
		}
	}

	public int count() {
		Node<T> current = start;
		int count = 0;
		while (current != null) {
			current = current.nextNode;
			count++;
		}
		return count;
	}
	
	public void display() {
		Node<T> current = start;
		while (current != null) {
			System.out.println(current.data);
			current = current.nextNode;
		}
	}
	
	public void insertAfter(T after,T data) {
		Node<T> current= start;
		while(current !=null) {
			if(current.data.equals(after)) {
				Node<T>newNode= new Node<T>(data);
				newNode.nextNode=current.nextNode;
				current.nextNode=newNode;
				return;
				
			}
			current =current.nextNode;
		}
		
	}
}
