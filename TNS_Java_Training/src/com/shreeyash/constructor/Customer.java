package com.shreeyash.constructor;

public class Customer {
	//Default Constructor
	Customer(){
		System.out.println("Default Constructor");
	}
	
	Customer(int Id,String Name){
		System.out.println("Parameterized Constructor");
		System.out.println("ID :"+Id);
		System.out.println("Name:" +Name);
	}
}
