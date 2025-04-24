package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;

public class Main5 {
public static void main(String[] args) {
	BillItem b1 = new BillItem("Redmi", 3, 14000.00);
	BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00),
			new BillItem("OPPO", 4, 20000.00),
			new BillItem("IPhone", 4, 24000.00),
			b1 };
	System.out.println("Before Sort"+Arrays.toString(billItems));
	int n = billItems.length;
	
	for (int i = 1; i < n; i++) {
		BillItem key = billItems[i];
		int j = i - 1;
		int r=billItems[j].compareTo(key);
		while (j >= 0 && r > 0) {
			billItems[j + 1] = billItems[j];
			j = j - 1;
			if(j>=0)
				r=billItems[j].compareTo(key);
		}
		billItems[j + 1] = key;

	}
	System.out.println("After Sort" + Arrays.toString(billItems));
}
}
