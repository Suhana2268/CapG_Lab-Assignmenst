import java.util.Scanner;

public class Difference {
	public static int calculateDifference(int n) {
		int sum = 0;
		int sumOfsq = ((n*(n+1)*(2*n+1)))/6;
		int sumN = (n*(n+1))/2;
		int sumSq = sumN*sumN;
		int diff = 0;
		if(sumOfsq > sumSq) {
			diff = sumOfsq - sumSq;
		}
		else {
			diff = sumSq - sumOfsq;
		}
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		int res = calculateDifference(n);
		System.out.println("The result is: "+res);

	}

}
