import java.util.Scanner;

public class FibonacciRec {
	public static void fib(int a, int b, int c, int n) {
		
		if(n-2 > 0) {
		c = a+b;
		a = b;
		b = c;
		fib(a,b,c,n-1);
		return;
		
		}
		System.out.println("The value of fibonacci series is :"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1, b = 1;
		int c = 0;
		fib(a,b,c,n);
		
		

	}

}