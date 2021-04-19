package controlStatementsLab;

import java.util.Scanner;

public class SumOfCubes {
	public static int sumOfCube(int n) {
	int x = n;
	int sum = 0;
	while(n > 0) {
		x = n%10;
		sum = sum + (x*x*x);
		n /= 10;
		
	}
	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int res = sumOfCube(n);
		System.out.println(res);
		

	}

}
