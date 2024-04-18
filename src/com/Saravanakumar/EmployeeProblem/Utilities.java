package com.Saravanakumar.EmployeeProblem;
import com.Saravanakumar.EmployeeProblem.Employees.*;
public class Utilities {
	
	
	public static String GithubLink(Developer dev) {
		return "https://github.com/"+dev.githubUserName;
	}
	
	public static double SalaryDifference(Employees emp1,Employees emp2) {
		double empSalary1 =emp1.getSalary();
		double empSalary2 = emp2.getSalary();
		
		if(empSalary1 > empSalary2)
			return empSalary1-empSalary2;
		else
		   return empSalary2-empSalary1;
	}
	
	public static  void printBasicDetails(Employees emp) 
	{
		System.out.println("-----------------------------------");
		System.out.println("Employee Id : "+emp.getEmpId());
		System.out.println("Name : "+emp.Name);
		System.out.println("Age : "+emp.getAge());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("-----------------------------------");
	}
	
}
	
	


