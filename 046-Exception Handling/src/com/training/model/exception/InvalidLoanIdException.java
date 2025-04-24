package com.training.model.exception;

public class InvalidLoanIdException extends RuntimeException {

	public InvalidLoanIdException() {
		super();
	}

	public InvalidLoanIdException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidLoanIdException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidLoanIdException(String message) {
		super(message);
	}

	public InvalidLoanIdException(Throwable cause) {
		super(cause);
	}

}
