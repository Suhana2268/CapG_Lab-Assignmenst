import java.util.Scanner;

public class Ex5Sum {
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i%3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		int res = calculateSum(n);
		System.out.println(res);

	}

}
