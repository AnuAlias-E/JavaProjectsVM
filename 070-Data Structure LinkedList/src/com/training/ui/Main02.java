package com.training.ui;

import com.training.ds.LongLinkedList;

public class Main02 {
	public static void main(String[] args) {
		LongLinkedList list = null;
		list = new LongLinkedList();

		list.insert(90L);
		list.insert(10L);
		list.insert(20L);
		list.insert(150L);
		list.insert(200L);
		list.insert(15L);
		list.display();
	}
}
