import java.util.Scanner;

public class PowOf2 {
	public static boolean checkNumber(int n) {
		
		while(n%2 == 0) {
			n = n/2;
			//System.out.println(n);
			}
		//System.out.println(n);
		if(n == 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(checkNumber(n)) {
			System.out.println("Power of two");
		}
		else {
			System.out.println("Not a power of two");
		}

	}

}
