package com.training.ui;

import com.training.model.SafeLongIncrement;

public class Main03 {
	public static void main(String[] args) {
		SafeLongIncrement sLongIncrement = new SafeLongIncrement();
		sLongIncrement.increment();
		System.out.println(sLongIncrement.getValue());
	}
}
