package com.Saravanakumar.Assignment3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		Commission commission = new Commission();
		commission.Accept_Details_of_an_Employee();
		double commissionAmount = commission.CalculateCommission();
		System.out.println("The commission Amount is :"+commissionAmount);
		
	}

}
