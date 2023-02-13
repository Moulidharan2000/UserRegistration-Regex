package com.bridgelabz.regexpattern;

public class InvalidUserDetailsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvalidUserDetailsError error;
	
	public InvalidUserDetailsException(String message, InvalidUserDetailsError error) {
		super(message);
		this.error = error;
	}
	
	public InvalidUserDetailsError getError() {
		return error;
	}
	
}
