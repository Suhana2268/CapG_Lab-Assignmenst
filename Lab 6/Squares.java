package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Squares {
	
	public static Map<Integer, Integer> getSquares(int[] arr) {
		
		Map<Integer, Integer> mi = new HashMap<Integer, Integer>();
		
		for(int i : arr) {
			mi.put(i, i*i);
		}
		
		return mi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to enter? please enter");
		int n = sc.nextInt();
		System.out.println("Enter the numbers");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Map<Integer, Integer> m = getSquares(arr);
		System.out.println("The squares of the numbers are");
		for(Map.Entry i: m.entrySet()) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}

	}

}
