package com.vips.edu.emp;

	
public class EmailFilters {
	static String emails[] = {
			"ramesh@gmail.com",
			"rakesh@outlook.com",
			"lokesh@linkedin.com",
			"mahesh@gmail.com",
			"ganesh@gmail.com",
			"rajesh@outlook.com"
		};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gm = 0, li = 0, out = 0;
		for(String em : emails) {
			if(em.endsWith("@gmail.com")) {
				gm++;
			}
			else if(em.endsWith("@outlook.com")) {
				out++;
			}
			else if(em.endsWith("@linkedin.com")) {
				li++;
			}
		}
		System.out.println("Email with gmail domain: "+gm);
		System.out.println("Email with outlook domain: "+out);
		System.out.println("Email with linkedin domain: "+li);
	}

}
