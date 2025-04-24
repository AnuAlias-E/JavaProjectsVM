package com.training.ui;

import com.training.ds.BinaryTree;
import com.training.ds.BinaryTreeImpl;
import com.training.model.Circle;

public class Main03 {
	public static void main(String[] args) {
		BinaryTree<Circle> circleTree;
		circleTree = new BinaryTreeImpl<>();
		try {
			circleTree.insert(new Circle(34));
			circleTree.insert(new Circle(10));
			circleTree.insert(new Circle(24));
			circleTree.insert(new Circle(18));
			circleTree.insert(new Circle(20));

			circleTree.inorder();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
