package lab_excercise2;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameCheck n = new NameCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String fname = sc.next();
		String lname = sc.next();
		
		try {
			n.doCheckName(fname, lname);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
