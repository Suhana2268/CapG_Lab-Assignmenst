import java.util.Scanner;

public class PrimeNumbers {
	public static boolean isPrime(int n) {
		boolean prime = false;
		int count = 0;
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count > 0) {
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the limit");
		for(int i = 2; i <= n; i++) {
			if(isPrime(i) == true) {
				System.out.println(i+" ");
			}
		}
		

	}

}
