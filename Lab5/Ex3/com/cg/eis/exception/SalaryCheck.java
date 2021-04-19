package com.cg.eis.exception;

public class SalaryCheck {
	
	public void doCheckSalary(double salary) throws EmployeeException {
		
		if(salary >= 3000) {
			System.out.println("Eligible employee");
		}
		else {
			throw new EmployeeException("Sorry your salary is less than 3000!");
		}
	}

}
