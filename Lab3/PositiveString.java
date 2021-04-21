package lab_exercise3;

import java.util.Scanner;

public class PositiveString {
	
	public static boolean isPosiitveString(String str) {
		int s = 0, x = 0;
		for(int i = 0;  i < str.length(); i++) {
			if(str.charAt(i) < x) {
				s = 1;
				break;
			}
			else {
				x = str.charAt(i);
			}
		}
		if(s == 0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		if(isPosiitveString(str)) {
			System.out.println("Yes, it is a positive string");
			
		}
		else {
			System.out.println("No, it is not a posiitve string");
		}

	}

}
