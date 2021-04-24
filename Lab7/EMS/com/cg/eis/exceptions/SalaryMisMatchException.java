package com.cg.eis.exception;

public class SalaryMisMatchException extends Exception{
	
	int salary;
	
	
	

	public SalaryMisMatchException(int salary) {
		super();
		this.salary = salary;
	}

	public SalaryMisMatchException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryMisMatchException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public SalaryMisMatchException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SalaryMisMatchException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SalaryMisMatchException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Clerk salary cannot be more than 5000 and your salary is : "+salary;
	}
	
	

}
