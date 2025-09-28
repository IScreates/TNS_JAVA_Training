package com.First.hello;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		int r, sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			// 121 ---->  1
			r = n % 10;
			n = n / 10;
			sum = sum * 10 + r;	
		}
		if(sum==n) {
			System.out.println("The Enter Number is Palindrome.");
		}else {
			System.out.println("The Enter Number is not Palindrome.");
		}
	}
}
