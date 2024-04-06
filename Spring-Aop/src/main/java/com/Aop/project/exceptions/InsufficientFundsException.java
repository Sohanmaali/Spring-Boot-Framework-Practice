package com.Aop.project.exceptions;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String desc) {
		super(desc);
	}
}
