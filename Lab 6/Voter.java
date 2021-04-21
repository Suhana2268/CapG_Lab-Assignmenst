package lab;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Voter {
	
	public static List<String> votersList(Map<String, Integer> m) {
		
		List<String> l = new ArrayList<String>();
		
		for(Entry<String, Integer> i : m.entrySet()) {
			if(i.getValue() > 18) {
				l.add(i.getKey());
			
				
			}
		}
		
		return l;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of voters:");
		int n = sc.nextInt();
		Map<String, Integer> m = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++) {
			String id = sc.next();
			int age = sc.nextInt();
			m.put(id, age);
		}
		
		List<String> l = votersList(m);
		System.out.println("The list of eligible voters is :"+l);
		

	}

}
