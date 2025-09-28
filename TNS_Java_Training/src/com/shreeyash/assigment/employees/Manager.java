package com.shreeyash.assigment.employees;

public class Manager extends Employee {
	private String department;
	
	public Manager(int employeeId,String name,double salary,String department) {
		super(employeeId,name,salary);
		this.department=department;
	}
	
	public String getdepartment() {
		return department;
	}
	
	public void setdepartment(String department) {
		this.department=department;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Department:"+department);
	}
}
