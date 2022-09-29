package com.syntax.class008;

import java.util.Scanner;

public class Replit006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String instructor = scan.nextLine();
		String job;

		switch (instructor) {
		case "Asghar":
			job = "Java";
			break;
		case "Moazzam":
			job = "SDLC";
			break;	
		case "Weqas":
			job = "Selenium";
			break;
		case "Asel":
			job = "every";
			break;
		default:
			job = "Invalid instructor selected";
	}
		System.out.println("Will take care of "+job+" Assignment");
	}
	}
