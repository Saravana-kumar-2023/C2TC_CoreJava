package com.Saravanakumar.EmployeeProblem;

public class Employees {
	public String Name;
	private int Age;
	public int EmpId;
	private double Salary;
	
	public Employees(String Name,int Age,int EmpId,double Salary) {	
		super();
		this.Name = Name;
		this.Age = Age;
		this.EmpId = EmpId;
		this.Salary = Salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	

}
