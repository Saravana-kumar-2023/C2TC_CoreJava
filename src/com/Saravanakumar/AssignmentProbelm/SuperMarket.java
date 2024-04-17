package com.Saravanakumar.AssignmentProbelm;
import java.util.Scanner;
public class SuperMarket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int product = 1;
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		while(num!=0) {
			int digit = num % 10;
			product = product * digit;
			num=num/10;
			
		}
		System.out.println("The value is: "+product);
	}

}
