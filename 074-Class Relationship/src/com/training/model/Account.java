package com.training.model;

public interface Account {
	void deposit(double amount) throws Exception;

	void withDraw(double amount) throws Exception;
}
