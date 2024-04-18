package com.Saravanakumar.EmployeeProblem;
import com.Saravanakumar.EmployeeProblem.Employees.*;
import com.Saravanakumar.EmployeeProblem.Utilities.*;
import java.util.*;
public class AssignmentMain {
	public static void main(String[] args)
	{
		Developer dev = new Developer("Saravana kumar",21,Employees.totalEmployees+1,40000,"Saravanakumar",1);
		System.out.println(Utilities.GithubLink(dev));
		
		Manager man = new Manager("Mithran",22,Employees.totalEmployees+1,78954,"Mithran",2,3);
		System.out.println(Utilities.SalaryDifference(dev, man));
		Utilities.printBasicDetails(man);
		
	}

}
