package com.syntax.class003;

import java.util.Scanner;
//set up code that brings up the scanner code
//bring in the scanner code
//must have the this

public class ScannerTutorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//declaring an object
		//literally an object a phyical object
		//Scanner is a phyical object in the computer
		//get a line a word from the user
		System.out.println("What's your first name?");
		String firstName = scan.next();
		System.out.println(firstName);
		//store that first name into a string
		System.out.println("What's your age?");
		int age = scan.nextInt();
		System.out.println(age);
		System.out.println("What's your senior quote?");
		String quote = scan.next(); //.next only gets the next word and not quote
		quote += scan.nextLine();
		System.out.println("Thank You "+firstName+", Your age is "+age+" years old");
		System.out.println("and your Senior Quote is "+quote);
		
	}

}
