package com.training.ds;

import java.util.Comparator;

public class BinaryTreeImpl<T> implements BinaryTree<T> {
	Node<T> root;
	Comparator<T> comparator;

	public BinaryTreeImpl() {
		root = null;
	}

	public BinaryTreeImpl(Comparator<T> cmp) {
		this.comparator = cmp;
	}

	@Override
	public void insert(T key) throws Exception {
		root = insertRec(root, key);

	}

	private Node insertRec(Node<T> root, T key) {

		// if the tree is empty, return a new node
		if (root == null) {
			root = new Node(key);
			return root;
		}

		int r;
		if (this.comparator == null) {
			// otherwise , recur down the tree
			Comparable obj1 = (Comparable) key;
			Comparable obj2 = (Comparable) root.key;
			r = obj1.compareTo(obj2);
		} else {
			r = this.comparator.compare(key, root.key);
		}
		if (r < 0) {
			root.left = insertRec(root.left, key);
		} else if (r > 0) {
			root.right = insertRec(root.right, key);
		}
		// return the unchanged node pointer
		return root;

	}

	@Override
	public void inorder() throws Exception {
		inorderRec(root);

	}

	private void inorderRec(Node<T> root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key + " ");
			inorderRec(root.right);
		}
	}

}
