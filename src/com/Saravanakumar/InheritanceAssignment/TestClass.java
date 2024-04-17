package com.Saravanakumar.InheritanceAssignment;
import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		 int No_of_gears = scanner.nextInt();
		 int Speed_of_bicycle = scanner.nextInt();
		 int seat_height = scanner.nextInt();
		 MontaneBike mb = new MontaneBike(No_of_gears,Speed_of_bicycle,seat_height);
		 System.out.println(mb);	 
		 scanner.close();
	}

}
