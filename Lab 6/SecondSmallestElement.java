package lab;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallestElement {
	
	public static int getSecondSmallest(int[] arr) {
		
		List<Integer> l = new ArrayList<Integer>(arr.length);
		for(int i : arr) {
			l.add(Integer.valueOf(i));
		}
		Collections.sort(l);
		return l.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numbers you want to enter");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = getSecondSmallest(arr);
		System.out.println("The second smallest element is: "+result);
		

	}

}
