package com.syntax.class008;

import java.util.Scanner;

public class Replit007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the Child");
		int age = scan.nextInt();
		String action=null;
		
		switch (age) {
		case 1:
			action = "Crawl";
			break;
		case 2:
			action = "Talk";
			break;
		case 3:
			action = "Dance";
			break;
		case 4:
			action = "get Trouble";
			break;	
		default:
		System.out.println("I don't know how old you are");	
		break;
	}
		System.out.println("You can "+ action);
	}
}
