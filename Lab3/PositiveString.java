package lab_exercise3;

import java.util.Scanner;

public class PositiveString {
	
	public static boolean isPosiitveString(String str) {
		boolean s = false;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
			if((int)str.charAt(i) <= (int)str.charAt(j)) {
				System.out.println(str.charAt(i)+" "+str.charAt(j));
				s =  true;
			}
			else {
				s = false;
				System.out.println(str.charAt(i)+" else  "+str.charAt(j));
				break;
			}
			break;
		}
		
	}
		return s;
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
