package com.training.ui;

import java.util.Comparator;

import com.training.ds.BinaryTree;
import com.training.ds.BinaryTreeImpl;
import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main06 {
	public static void main(String[] args) {

		Comparator<BillItem> cmp = new BillItemPriceComparator();
		BinaryTree<BillItem> billItemTree;
		billItemTree = new BinaryTreeImpl<>(cmp);

		try {
			billItemTree.insert(new BillItem("Dell", 21, 10000.00));
			billItemTree.insert(new BillItem("IPhone", 10, 100000.00));
			billItemTree.insert(new BillItem("Samsung", 8, 30000.00));
			billItemTree.insert(new BillItem("Oppo", 4, 20000.00));
			billItemTree.insert(new BillItem("Redmi", 7, 15000.00));

			billItemTree.inorder();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
