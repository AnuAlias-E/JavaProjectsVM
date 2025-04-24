package com.training.model.exception;

public class InvalidGradeException extends Exception {

	public InvalidGradeException() {
		super();
	}

	public InvalidGradeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidGradeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidGradeException(String message) {
		super(message);
	}

	public InvalidGradeException(Throwable cause) {
		super(cause);
	}

}
