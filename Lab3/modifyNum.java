package lab_exercise3;

import java.util.Scanner;

import javax.naming.directory.ModificationItem;

public class modifyNum {
	
	public static int modifyNumber(int number) {
		
		String str = String.valueOf(number);
		int len = str.length();
		int arr[] = new int[len];
		int arr2[] = new int[len];
		char c[] = new char[len];
		char ch[] = new char[len];
		for(int i = 0; i < len; i++) {
			c[i] = str.charAt(i);
		}
		
		for(int i = 0; i < len; i++) {
			arr[i] = (int) (c[i]);
		}
		for(int i = 0; i < len-1; i++) {
			arr2[i] = Math.abs(arr[i]-arr[i+1]);
		}
		for(int i = 0; i < len-1; i++) {
			ch[i] = (char)(arr2[i] + '0');
		}
		ch[len-1] = (char)(arr[len-1]);
		
		String res = new String(ch);
		//System.out.println(res);
		int num = Integer.parseInt(res);
		return num;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int res = modifyNumber(n);
		System.out.println(res);
	}

}
