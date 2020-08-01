package com.arwizon.main;

public class MyException extends Exception {
	String message;
	public MyException(String msg) {
		this.message = msg;
	}
	@Override
	public String getMessage() {
		return message;
	}
	}
