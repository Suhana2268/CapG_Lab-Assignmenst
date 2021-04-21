package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
	
	public static Map<Character, Integer> countChars(char[] arr) {
		
		Map<Character, Integer> mc = new HashMap<Character, Integer>();
		
		for(char c: arr) {
			if(mc.containsKey(c)) {
				mc.put(c, mc.get(c)+1);
			}
			else {
				mc.put(c, 1);
			}
		}
		
		
		
		return mc;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.next();
		char ch[] = str.toCharArray();
		Map<Character, Integer> m = countChars(ch);
		for(Map.Entry i : m.entrySet()) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
	}

}
