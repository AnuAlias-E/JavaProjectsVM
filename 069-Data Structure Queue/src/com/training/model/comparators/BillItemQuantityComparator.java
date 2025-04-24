package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.BillItem;

public class BillItemQuantityComparator implements Comparator<BillItem> {

	@Override
	public int compare(BillItem o1, BillItem o2) {
		if(o1.getQuantity()<o2.getQuantity())
			return -1;
		if(o1.getQuantity()>o2.getQuantity())
			return 1;
		return 0;
	}

	}


