package com.training.model.exception;

public class InvalidTenureException extends RuntimeException {

	public InvalidTenureException() {
		super();
	}

	public InvalidTenureException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidTenureException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidTenureException(String message) {
		super(message);
	}

	public InvalidTenureException(Throwable cause) {
		super(cause);
	}

}
