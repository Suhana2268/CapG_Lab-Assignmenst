package lab_exercise3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDIfference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Date in (YYYY/MM/DD) format");
 	   	int year=sc.nextInt();
 	   	int month=sc.nextInt();
 	   	int date=sc.nextInt();
 	   	LocalDate inpDate = LocalDate.of(year, month, date);
 	   	LocalDate dt = LocalDate.now();
        
        Period dif = Period.between(inpDate, dt);
        
        System.out.printf("Difference is " +dif.getYears()+" years " + dif.getMonths()+" months " +dif.getDays()+" days "); 
	}

}
