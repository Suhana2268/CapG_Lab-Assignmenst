package lab_Ex_3;

import java.util.Scanner;

public class Library {
	Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		
		while(true) {
			System.out.println("1. Books"+"\n"+"2. Journals"+"\n"+"3. Videos"+"\n"+"4. CD"+"\n"+"0. Exit");
			int option = sc.nextInt();
			switch(option) {
			case 1: l.written(new Book());
			break;
			case 2: l.written(new Journal());
			break;
			case 3: l.media(new Video());
			break;
			case 4: l.media(new CD());
			break;
			case 0: System.exit(0);
			}
		}
		

	}
	
public void written(WrittenItem w) {
		
		
        
        if(w instanceof Book) {
        	System.out.println("Enter Book id");
    		w.setId(sc.nextInt());
    		System.out.println("Enter book title");
    		w.setTitle(sc.next());
    		System.out.println("Enter author");
            w.setAuthor(sc.next());
    		System.out.println("Enter copies");
            w.setCopies(sc.nextInt());
        	w.printDetails();
        }
		if(w instanceof Journal) {
			System.out.println("Enter Journal id");
			w.setId(sc.nextInt());
			System.out.println("Enter Jornal title");
			w.setTitle(sc.next());
			System.out.println("Enter author");
	        w.setAuthor(sc.next());
			System.out.println("Enter copies");
	        w.setCopies(sc.nextInt());
			System.out.println("Enter published year");
			((Journal) w).setYearOfPublished(sc.nextInt());
			w.printDetails();
		}
	}
	public void media(MediaItems m) {
		System.out.println("Enter the runtime");
		m.setRuntime(sc.nextInt());
		if(m instanceof CD) {
			System.out.println("Enter artist name");
			((CD) m).setArtist(sc.next());
			System.out.println("Enter genre");
			((CD) m).setGenre(sc.next());
			((CD) m).printDetails();
		}
		if(m instanceof Video) {
			System.out.println("Enter director");
			((Video) m).setDirector(sc.next());
			System.out.println("Enter genre");
			((Video) m).setGenre(sc.next());
			System.out.println("Enter release year");
			((Video) m).setYear(sc.nextInt());
			((Video) m).printDetails();
		}
		
	}


}
