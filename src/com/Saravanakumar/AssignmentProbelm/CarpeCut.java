package com.Saravanakumar.AssignmentProbelm;
import java.util.Scanner;
public class CarpeCut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of cuts:");
		int n = scanner.nextInt();
		int result = maximum_equal_Squares(n);
		System.out.println("Maximum number of equal squares: " + result);
		scanner.close();
	}

	public static int maximum_equal_Squares(int n) {
		 if (n <= 0) {
	            return 1; 
	        } else {
	        	return (n - 1) * (n - 1);
	        }
	}
}
