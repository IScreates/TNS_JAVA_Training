package com.shreeyash.assigment.utilities;

import com.shreeyash.assigment.employees.Developer;
import com.shreeyash.assigment.employees.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager(101,"Shreeyash",90000,"IT");
		Developer developer = new Developer(102,"Alic",96000,"Java");
		
		System.out.println("=========Manager Details==========");
		manager.displayInfo();
		
		System.out.println("=========Developer Details=========");
		developer.displayInfo();
	}

}
