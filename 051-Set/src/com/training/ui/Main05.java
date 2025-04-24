package com.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main05 {
	public static void main(String[] args) {
		Set<BillItem> billItemsSet = new HashSet();
		billItemsSet.add(new BillItem("Dell", 4, 1000.00));
		billItemsSet.add(new BillItem("Iphone", 6, 40000.00));
		billItemsSet.add(new BillItem("Samsung", 4, 300.00));
		billItemsSet.add(new BillItem("Redmi", 8, 23000.00));
		billItemsSet.add(new BillItem("Oppo", 7, 30000.00));

		System.out.println("Size: " + billItemsSet.size());
		System.out.println(billItemsSet);

		BillItem billItem = new BillItem("Dell", 10, 1000.00);
		System.out.println(billItemsSet.contains(billItem));

		billItemsSet.remove(new BillItem("Dell", 10, 1000.00));

		Iterator<BillItem> it = billItemsSet.iterator();
		double total = 0.0;
		while (it.hasNext()) {
			BillItem b = it.next();
			total += b.getPrice();
		}
		System.out.println("Total : " + total);
		BillItemPriceComparator comparator = new BillItemPriceComparator();

		BillItem lowestPriceBillItem =new BillItem("OPPo",8,4000);

		for (BillItem b : billItemsSet) {
			int r = comparator.compare(b, lowestPriceBillItem);
			if (r < 0) {
				lowestPriceBillItem = b;
			}
		}
		System.out.println(lowestPriceBillItem);
		billItemsSet.clear();
		System.out.println(billItemsSet.isEmpty());
	}
}
