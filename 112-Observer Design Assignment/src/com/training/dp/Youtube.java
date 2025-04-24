package com.training.dp;

public class Youtube implements Observer {

	@Override
	public void update(String news) {
		System.out.println("Youtube : " + news);
	}

}
