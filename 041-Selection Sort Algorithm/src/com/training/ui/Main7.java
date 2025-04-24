package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main7 {
public static void main(String[] args) {
	BillItem b1 = new BillItem("Redmi", 3, 14000.00);
	BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00), new BillItem("OPPO", 4, 20000.00),
			new BillItem("IPhone", 4, 24000.00), b1 };
	System.out.println("Before Sort" + Arrays.toString(billItems));
	BillItemQuantityComparator quantityComparator = new BillItemQuantityComparator();
	
	int n = billItems.length;

	int imin;
	for (int i = 0; i < n - 1; i++) {
		imin = i;
		for (int j = i + 1; j < n; j++) {
			int r =quantityComparator.compare( billItems[j],billItems[imin]);
			if (r < 0) {
				imin = j;
			}
		}
		BillItem temp;
		temp = billItems[i];
		billItems[i] = billItems[imin];
		billItems[imin] = temp;

	}

	System.out.println("After Sort: " + Arrays.toString(billItems));
	billItems = null;
}
}
