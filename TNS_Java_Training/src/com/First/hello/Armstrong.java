package com.First.hello;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,cube;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n>0) {
			r = n % 10;
			n = n / 10;
			cube = r*r*r;
			sum = sum+cube;
		}
		if(sum==n) {
			System.out.println("Number is Armstrong");
		}
	}

}
