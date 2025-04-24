package com.training.exceptions;

public class InvalidStackSizeException extends Exception{

	public InvalidStackSizeException() {
		super();	}

	public InvalidStackSizeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidStackSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidStackSizeException(String message) {
		super(message);
	}

	public InvalidStackSizeException(Throwable cause) {
		super(cause);
	}

}
