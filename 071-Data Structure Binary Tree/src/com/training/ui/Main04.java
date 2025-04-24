package com.training.ui;

import com.training.ds.BinaryTree;
import com.training.ds.BinaryTreeImpl;
import com.training.model.CourseItem;

public class Main04 {
	public static void main(String[] args) {

		BinaryTree<CourseItem> courseItemTree;
		courseItemTree = new BinaryTreeImpl<>();
		try {
			courseItemTree.insert(new CourseItem("Java", 34, 3000.00));
			courseItemTree.insert(new CourseItem("JQuery", 23, 2000.00));
			courseItemTree.insert(new CourseItem("CSS", 14, 2000.00));
			courseItemTree.insert(new CourseItem("SQL", 30, 4000.00));
			courseItemTree.insert(new CourseItem("Mongo DB", 25, 1500.00));

			courseItemTree.inorder();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
