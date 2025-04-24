package com.training.ds;

public class LongLinkedList {

	public LongNode head;

	public void insert(long data) {
		LongNode newLongNode = new LongNode(data);
		newLongNode.next = null;

		if (head == null)
			head = newLongNode;
		else {
			LongNode curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newLongNode;
		}

	}

	public void display() {
		LongNode current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}

}
