package com.training.dp;

public class NewsPaper implements Observer {

	@Override
	public void update(String news) {
		System.out.println("News Paper : " + news);
	}

}
