package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.*;

public class EmployeeServiceImp implements EmployeeService{

	List<Employee> empList = new ArrayList<Employee>();
	//HashMap<String, set<Employee>> = new HashMap<>();
	
	
	public boolean insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(e.getSalary() > 5000 && e.getSalary() < 20000 && e.getDesignation().equals("System Associate")) {
			e.setInsuranceScheme("Scheme C");
		}
		else if(e.getSalary() >= 20000 && e.getSalary() < 40000 && e.getDesignation().equals("Programmer")) {
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSalary() >= 40000 && e.getDesignation().equals("Manager")) {
			e.setInsuranceScheme("Scheme A");
		}
		else if(e.getSalary() <= 5000 && e.getDesignation().equals("Clerk")) {
			e.setInsuranceScheme("No Scheme");
		}
		boolean x = empList.add(e);
		return x;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		
		return empList;
	}

	public List<Employee> getAllEmployeesByInsurance(String insurance) {
		
		List<Employee> em = new ArrayList<Employee>();
		for(Employee e : empList) {
			if(e.getInsuranceScheme().equals(insurance)) {
				em.add(e);
			}
 		}
		return em;
	}

	public List<Employee> deleteEmployee(int id, String name) {
		for(Employee e : empList) {
			if(e.getId() == id && e.getName().equals(name)) {
				empList.remove(e);
			}
		}
		return empList;
	}

}
