package com.training.model.exception;

public class InvalidMarkException  extends RuntimeException{

	public InvalidMarkException() {
		super();
	}

	public InvalidMarkException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidMarkException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidMarkException(String message) {
		super(message);
	}

	public InvalidMarkException(Throwable cause) {
		super(cause);
	}


	

}
