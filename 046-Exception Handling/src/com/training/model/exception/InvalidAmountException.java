package com.training.model.exception;

public class InvalidAmountException extends RuntimeException{

	public InvalidAmountException() {
		super();
	}

	public InvalidAmountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidAmountException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidAmountException(String message) {
		super(message);
	}

	public InvalidAmountException(Throwable cause) {
		super(cause);
	}

}
