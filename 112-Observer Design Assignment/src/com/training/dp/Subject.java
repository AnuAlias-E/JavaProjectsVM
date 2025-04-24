package com.training.dp;

public interface Subject {
	void addObserver(Observer observer);

	void removerObserver(Observer observer);

	void notifyObservers();
}
