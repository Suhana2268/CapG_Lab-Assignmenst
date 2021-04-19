package lab_exercise3;

import java.util.Scanner;

public class CountInString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int words = 0, lines = 0, ch = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				words++;
			}
			else if(str.charAt(i) == '\n' || str.charAt(i) == '.') {
				lines++;
			}
			else {
				ch++;
			}
		}
		System.out.println("The number of letters are: "+ch);
		System.out.println("The number of words are: "+(words+1));
		System.out.println("The number of lines are: "+lines);
	}

}
