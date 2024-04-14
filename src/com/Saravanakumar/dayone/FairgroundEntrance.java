package com.Saravanakumar.dayone;
import java.util.Scanner;

public class FairgroundEntrance {	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int maxEntrance; 
	        if (a < b) {
	        	System.out.print(b + "\t");
	            maxEntrance = a+b;
	            System.out.print(maxEntrance);
	        }
	        else{ 
	        	System.out.print(a + "\t");
	            maxEntrance = b+a;
	            System.out.print(maxEntrance);
	        }
		}
}