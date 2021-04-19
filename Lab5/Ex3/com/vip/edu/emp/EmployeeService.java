package com.vips.edu.emp;

public class EmployeeService {
	
	private String employees[] = {
			"101001011", "102001022", "103002011",
			"104003080", "105002020", "106002080", "0000000000"
	};
	
	public String[] getEmployeeCodes() {
		String codes[] = new String[employees.length];
		int count = -1;
		for(String empid : employees) {
			codes[++count] = empid.substring(0,3);
		}
		return codes;
	}
	
	public String[] getEmployeeCity() {
		String cities[] = new String[employees.length];
		int count = -1;
		String city[] = new String[employees.length];
		for(String empCity : employees) {
			cities[++count] = empCity.substring(6,9);
			
		}
		return cities;
		
	}
	
	public void displayEmpIdCity(String cities[]) throws EmployeeException {
		for(int i = 0; i < employees.length; i++) {
			if(cities[i].equals("011")) {
				System.out.println(cities[i]+" : "+"Delhi");
			}
			else if(cities[i].equals("022")) {
				System.out.println(cities[i]+" : "+"Mumbai");
			}
			else if(cities[i].equals("080")) {
				System.out.println(cities[i]+" : "+"Banglore");
			}
			else if(cities[i].equals("020")){
				System.out.println(cities[i]+" : "+"Pune");
			}
			
			else {
				throw new EmployeeException(cities[i]+" city does nnot exits in company's list");
				
			}
		}
	}

}
