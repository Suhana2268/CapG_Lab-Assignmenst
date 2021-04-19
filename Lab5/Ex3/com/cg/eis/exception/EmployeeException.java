package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	private String excMsg = "";
	public EmployeeException() {
		super();
	}
	public EmployeeException(String message) {
		super(message);
		this.excMsg = message;
	}
	
	@Override
	public String toString() {
		return "Salary Exception :- "+excMsg;
	}

}
