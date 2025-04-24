package com.training.dp;

import java.util.LinkedList;
import java.util.List;

public class NewsStation implements Subject {
	private List<Observer> observers = new LinkedList<>();
	private String news;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removerObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(news);
		}
	}

	public void setNews(String news) {
		this.news = news;
		notifyObservers();
	}

}
