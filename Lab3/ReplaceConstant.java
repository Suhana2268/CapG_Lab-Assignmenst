package lab_exercise3;

import java.util.Scanner;

public class ReplaceConstant {
	
	public static String alterString(String str) {
		
		str = str.toLowerCase();
		char ch;
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) != 'a') && (str.charAt(i) != 'e') && (str.charAt(i) != 'i') && (str.charAt(i) != 'o') && (str.charAt(i) != 'u')) {
				ch = (char) (str.charAt(i)+1);
				res += ch;
			}
			else {
				res += str.charAt(i);
			}
		}
		return res.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		String res = alterString(str);
		System.out.println(res);

	}

}
