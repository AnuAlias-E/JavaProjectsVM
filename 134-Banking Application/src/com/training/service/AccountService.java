package com.training.service;

import com.training.exception.NegativeValueException;

public interface AccountService {
void deposit(double amount) throws NegativeValueException;
void withdraw(double amount)throws NegativeValueException;
}
