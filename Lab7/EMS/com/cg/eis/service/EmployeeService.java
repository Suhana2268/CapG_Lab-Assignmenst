package com.cg.eis.service;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.cg.eis.beans.*;
import com.cg.eis.exception.SalaryMisMatchException;

public interface EmployeeService {
	
	public HashMap<Set<Employee>, String> insertEmployee(Employee e) throws SalaryMisMatchException;
	public HashMap<Set<Employee>, String> getAllEmployees();
	public HashMap<Set<Employee>, String> getAllEmployeesByInsurance(String insurance);
	

}
