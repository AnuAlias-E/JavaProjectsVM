package com.training.model;

public class HelloWorld {
String message="Welcome to Spring";

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "HelloWorld [message=" + message + "]";
}


}
