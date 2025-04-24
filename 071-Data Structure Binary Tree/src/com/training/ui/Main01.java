package com.training.ui;

import com.training.ds.IntBinaryTree;

public class Main01 {
	public static void main(String[] args) {

		IntBinaryTree tree = new IntBinaryTree();
		tree.insertRec(6);
		tree.insertRec(3);
		tree.insertRec(4);
		tree.insertRec(19);
		tree.insertRec(8);
		tree.insertRec(7);
		tree.insertRec(9);
		tree.inorder();
	}
}
