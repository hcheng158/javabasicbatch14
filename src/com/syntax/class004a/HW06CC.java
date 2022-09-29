package com.syntax.class004a;

import java.util.Scanner;

public class HW06CC {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card? True or False?");
		boolean cc=scan.nextBoolean();
		
	 {if (cc==false) {
		 System.out.println("Would you like to apply for a credit card?");
	 	} else {
			System.out.println("What is the balance of your credit card?");
			int balance=scan.nextInt();	
			if (balance>=1000) {
				System.out.println("Please pay off the balance immediately!");
			} else {
				System.out.println("Great! Feel free to spend more!");
			}
	 	}
	 } 
	}
}

