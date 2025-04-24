package com.training.model;

public class Y implements X{

	@Override
	public void print(int n) throws Exception {
		
		if (n < 0) {
			Exception e = new Exception("Invalid value");
			throw e;
		}
	}

	@Override
	public void test(double d) throws Exception {
		if(d<100) {
			Exception e = new Exception("Invalid value");
			throw e;
		}
		}
		
	}


