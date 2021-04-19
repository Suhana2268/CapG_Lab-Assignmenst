import java.util.Scanner;

public class TrafficLight {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("1.Red"+"\n"+"2.Orange"+"\n"+"3.Green"+"\n");
		int n = sc.nextInt();
		switch(n) {
			case 1:
				System.out.println("STOP");
				break;
			case 2:
				System.out.println("READY TO GO");
				break;
			case 3:
				System.out.println("GO");
				break;
				default:
					System.out.println("Thank you for using this application");
		
	}
	}

}
