package com.exceptions.examples;

public class MyOwnException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MyOwnException(String exceptionMessage)
	{
		super(exceptionMessage);
	}

}
