package com.vips.edu.emp;

public class MainExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		String cities[] = service.getEmployeeCity();
		
	/**	for(String empid : codes) {
			System.out.println(empid);
		}
		
		for(String empCity : cities) {
			System.out.println(empCity);
		}**/
		try {
			service.displayEmpIdCity(cities);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
		
	}
	

}
