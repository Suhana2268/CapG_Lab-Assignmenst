package lab_exercise3;

import java.util.Scanner;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer(str);
		sb1.append("|");
		sb2.append(sb1.reverse());
		System.out.println(sb2.toString());
		
		
	}

}
