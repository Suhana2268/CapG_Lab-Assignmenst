package lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseSort {
	
	 public static int[] getSorted(int[] arr) {
		 
		 String[] str = new String[arr.length];
		 for(int i = 0; i < arr.length; i++) {
			 str[i] = String.valueOf(arr[i]);
		 }
		
		 String s[] = new String[arr.length];
		 int res[] = new int[arr.length];
		 StringBuffer[] sb = new StringBuffer[arr.length];
		 
		 
		 for(int i = 0; i < arr.length; i++) {
			 sb[i] = new StringBuffer(str[i]);
			 sb[i].reverse();
			 s[i] = String.valueOf(sb[i]);
		 }
		 
		 Arrays.sort(s);
		 for(int i = 0; i < arr.length; i++) {
			 int j = Integer.valueOf(s[i]);
			 res[i] = j;
			 
		 }
		 return res;
				 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numbers you want to enter");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter numbers");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k[] = getSorted(arr);
		
		System.out.println("The reversed and sorted array is: ");
		for(int i = 0; i < n; i++) {
			System.out.print(k[i]+" ");
		}
		
		

	}

}
