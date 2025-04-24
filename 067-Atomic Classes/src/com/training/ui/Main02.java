package com.training.ui;

import com.training.model.SafeIncrement;

public class Main02 {
	public static void main(String[] args) {
		SafeIncrement si = new SafeIncrement();
		si.increment();
		System.out.println(si.getValue());
	}
}
