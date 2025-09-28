package com.shreeyash.assigment.employees;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	public Employee(int employeeId,String name,double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayInfo() {
		System.out.println("Employee ID:" +employeeId);
		System.out.println("Employee Name:" +name);
		System.out.println("Employee Salary:" +salary);
	}	
}
