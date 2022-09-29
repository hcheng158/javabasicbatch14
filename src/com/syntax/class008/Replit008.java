package com.syntax.class008;

import java.util.Scanner;

public class Replit008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		int roll = scan.nextInt();
		String name=null;
		
		switch (roll) {
		case 101:
			name = "Ramesh";
			break;
		case 102:
			name = "Mahesh";
			break;
		case 103:
			name = "Mukesh";
			break;
		default:
			System.out.println("Not found Student name: in Class");
			break;
	}
		System.out.println(name);
}
}
