package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main6 {
	public static void main(String[] args) {
		BillItem b1 = new BillItem("Redmi", 3, 14000.00);
		BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00), new BillItem("OPPO", 4, 20000.00),
				new BillItem("IPhone", 4, 24000.00), b1 };
		System.out.println("Before Sort" + Arrays.toString(billItems));
		BillItemPriceComparator priceComparator = new BillItemPriceComparator();
		for (int i = 0; i < billItems.length; i++) {

			for (int j = 0; j < billItems.length - i - 1; j++) {
				
				int r = priceComparator.compare(billItems[j], billItems[j + 1]);
				if (r > 0) {// when the current item is greater than next
					BillItem temp;
					temp = billItems[j];
					billItems[j] = billItems[j + 1];
					billItems[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sort" + Arrays.toString(billItems));
		billItems=null;
	}
}
