package com.shreeyash.assignment3;

import java.util.Scanner;

public class Circle {
	
	private double radius;
	private String color;
	
	public void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius:");
		radius=sc.nextDouble();
		System.out.println("Enter a Color:");
		color=sc.next();
	}
	
	public void calaArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Color of the Circle:" + color);
		System.out.println("Area of the Circle:" + area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.getInput();
		c.calaArea();
	}

}
