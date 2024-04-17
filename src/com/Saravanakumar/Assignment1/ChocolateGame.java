package com.Saravanakumar.Assignment1;
import java.util.Scanner;
public class ChocolateGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        if(sum%2==0) {
        	System.out.println("No");
        }
        else {
        	System.out.println("Yes");
        }
	}
}
