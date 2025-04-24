package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.BillItem;

public class BillItemPriceComparator implements Comparator<BillItem> {

	@Override
	public int compare(BillItem o1, BillItem o2) {
		if(o1.getPrice()<o2.getPrice())
			return -1;
		if(o1.getPrice()>o2.getPrice())
			return 1;
		return 0;
	}

}
