package com.training.dp;

public class TVChannel implements Observer {

	@Override
	public void update(String news) {
		System.out.println("TVChannel : " + news);
	}

}
