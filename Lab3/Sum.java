package lab_exercise3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0, num;
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			String n = st.nextToken();
			sum += Integer.parseInt(n);
			
			
		}
		System.out.println(sum);
		

	}

}
