package com.training.exceptions;

public class StackEmptyException extends Exception{

	public StackEmptyException() {
		super();
	}

	public StackEmptyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StackEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public StackEmptyException(String message) {
		super(message);
	}

	public StackEmptyException(Throwable cause) {
		super(cause);
	}

}
