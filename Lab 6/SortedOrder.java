package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class SortedOrder {
	
	public static List<String> sort(HashMap<Integer, String> m) {
		List <String>l = new ArrayList<String>();
		l.addAll(m.values());
		Collections.sort(l);
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(100, "Suhana");
		hm.put(107, "Sohail");
		hm.put(108, "Noor");
		hm.put(104, "Shaju");
		hm.put(102, "Afreen");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The sorted map is: "+sort(hm));
		

	}
	
	

}
