package com.syntax.class004a;

import java.util.Scanner;

public class HW01Diploma220829 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a high school diploma? True or False?");
		boolean doTheyHaveItOrNot=scan.nextBoolean();
		{	
			if(doTheyHaveItOrNot) {
			System.out.println("Congratulations!");
		} if(doTheyHaveItOrNot) {
			System.out.println("What is your GPA Score?");
			float gpa=scan.nextFloat();
			if(gpa>=3.5) {
				System.out.println("You are eligible for a scholarship!");
			} else {
				System.out.println("You should have studied harder sucka.");
			}
		}else {
			System.out.println("You should have studied harder sucka.");
		}
			
	

		} 
	}
}