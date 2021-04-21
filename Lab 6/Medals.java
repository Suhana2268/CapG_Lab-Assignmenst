package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Medals {
	
	public static HashMap<String, String> getStudents(HashMap<String, Integer> m) {
		
		HashMap<String, String> res = new HashMap<>();
		
		for(Entry<String, Integer>i : m.entrySet()) {
			if(i.getValue() >= 90) {
				res.put(i.getKey(), "Gold");
				
			}
			else if(i.getValue() >= 80 && i.getValue() < 90) {
				res.put(i.getKey(), "Silver");
			}
			else if(i.getValue() >= 70 && i.getValue() < 80) {
				res.put(i.getKey(), "Bronze");
			}
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		int n = sc.nextInt();
		System.out.println("Enter the names and scores");
		for(int j = 0; j < n; j++) {
			
		String name= sc.next();
		int marks = sc.nextInt();
		m.put(name, marks);
		}
		HashMap<String, String> mc = getStudents(m);
		for(Map.Entry i: mc.entrySet()) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}

	}

}
