package com.Saravanakumar.AssignmentProbelm;
import java.util.Scanner;
public class Travelproblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		if(n<=1 || n>=1000) {
			System.out.println("Invalid input ");
			return ; 
		}
		else {
			for(int i=2;i<n;i++)
			{
				int positive = i*10;
				int negative = -i*10;
				System.out.println(negative +"\t"+ positive);
			}
			
		}
		

	}

}
