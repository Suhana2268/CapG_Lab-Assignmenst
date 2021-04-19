package com.cg.eis.exception;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalaryCheck s = new SalaryCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();
		
		try {
			s.doCheckSalary(salary);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
