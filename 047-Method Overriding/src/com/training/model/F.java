package com.training.model;

public class F extends E {

	@Override
	public void print(int n) throws Exception {
		if (n < 0) {
			Exception e = new Exception("Invalid value");
			throw e;
		}

	}

}
