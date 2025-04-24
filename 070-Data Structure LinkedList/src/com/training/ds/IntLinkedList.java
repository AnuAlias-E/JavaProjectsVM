package com.training.ds;

public class IntLinkedList {

	public IntNode head;

	public void insert(int data) {
		// Create a new_node with data
		IntNode new_node = new IntNode(data);
		new_node.next = null;

		// if the linked list is empty, then make the new_node is head
		if (head == null)
			head = new_node;
		else {
			// else traverse till the last node and insert the new_node here
			IntNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			// Insert the new_node at last node
			current.next = new_node;
		}

	}

	public void display() {
		IntNode current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}
}
