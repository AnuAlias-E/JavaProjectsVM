package com.training.exceptions;

public class StackIsFullException extends Exception{

	public StackIsFullException() {
		super();
	}

	public StackIsFullException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StackIsFullException(String message, Throwable cause) {
		super(message, cause);
	}

	public StackIsFullException(String message) {
		super(message);
	}

	public StackIsFullException(Throwable cause) {
		super(cause);
	}

}
