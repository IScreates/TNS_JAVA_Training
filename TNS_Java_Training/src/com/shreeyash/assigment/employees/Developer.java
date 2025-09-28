package com.shreeyash.assigment.employees;

public class Developer extends Employee {
	private String programmingLanguage;
	
	public Developer(int employeeId,String name,double salary,String programmingLanguage) {
		super(employeeId,name,salary);
		this.programmingLanguage=programmingLanguage;
	}
	public String getprogrammingLanguage() {
		return programmingLanguage;
	}
	
	public void setprogrammingLanguage(String programmingLanguage) {
		this.programmingLanguage=programmingLanguage;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Programming Language:"+programmingLanguage);
	}

}
