package com.training.model.exception;

public class InvalidCustomerNameException extends Exception{

	public InvalidCustomerNameException() {
		super();
	}

	public InvalidCustomerNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidCustomerNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCustomerNameException(String message) {
		super(message);
	}

	public InvalidCustomerNameException(Throwable cause) {
		super(cause);
	}

}
