package lab_excercise;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeCheck a = new AgeCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int n = sc.nextInt();
		try {
			a.doCheckAge(n);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
