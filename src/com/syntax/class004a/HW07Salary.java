package com.syntax.class004a;

import java.util.Scanner;

public class HW07Salary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many years have you works?");
		byte year=scan.nextByte();
		System.out.println("What is your annual salary?");
		int salary=scan.nextInt();
		if (year>=5) {
			System.out.println("You are qualified for a Bonus!");
			if (salary>=500000) {
				System.out.println("The amount is $5000 for this year!");
			} else {
				System.out.println("The amount is $3000 for this year!");
			}
		}else {
			System.out.println("Unfortunately, you are not qualified for Bonus this year.");
		}
		
				
	}

}
