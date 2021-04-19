import java.util.Scanner;

public class IncreasingNum {
	public static boolean checkNumber(int number) {
		int x = number;
		boolean res = false;
		boolean isles = false;
		x  %= 10;
		number /= 10;
		while(number >0) {
			if(x <= number%10) {
				isles = true;
				break;
			}
			x = number%10;
			number /= 10;
		}
		if(!(isles)) {
			res = true;
		}
		else {
			res =  false;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(checkNumber(n)) {
			System.out.println("Increasing number");
		}
		else {
			System.out.println("Not an Increasing number");
		}

	}

}
