package com.training.ds;

public class IntBinaryTree {

	IntNode root;

	public IntBinaryTree() {
		root = null;
	}

	// Method to insert a new node with key
	public void insertRec(int key) {
		root = insertRec(root, key);
	}

	// A recursive function to insert a new key in BST
	private IntNode insertRec(IntNode root, int key) {
		// if the tree is empty, return a new node
		if (root == null) {
			root = new IntNode(key);
			return root;
		}
		// otherwise , recur down the tree
		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		// return the unchanged node pointer
		return root;
	}

//Method to print the tree inorder
	public void inorder() {
		inOrderRec(root);
	}

//A utility function to do inorder traversal of BST
	private void inOrderRec(IntNode root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.print(root.key + " ");
			inOrderRec(root.right);
		}
	}
}
