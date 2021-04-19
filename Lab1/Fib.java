import java.util.Scanner;

public class Fib {
	public static int fib(int n) {
		int a =1, b = 1, c = 0;
		for(int i = 0; i <= n-2; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		a = 1;
		b = 1;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = fib(n);
		System.out.println("The "+n+"th number of fibonacci series is:  "+x);

	}

}
