package com.Saravanakumar.EmployeeProblem;

public class Manager extends Employees {
	public String teamName;
	protected int performanceRating;
	private int totalProjectsManaged;
	
	
	public int getTotalProjectsManaged() {
		return totalProjectsManaged;
	}
	public void setTotalProjectsManaged(int totalProjectsManaged) {
		this.totalProjectsManaged = totalProjectsManaged;
	}
	public Manager(String Name,int Age,int EmpId,double Salary,String teamName, int performanceRating, int totalProjectsManaged) {
		super(Name,Age,EmpId,Salary);
		this.teamName = teamName;
		this.performanceRating = performanceRating;
		this.totalProjectsManaged = totalProjectsManaged;
	}
	
	
	

}
