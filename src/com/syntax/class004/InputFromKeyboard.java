package com.syntax.class004;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {

		/* Scanner is a class that helps us take the input from the keyboard
		 * it contains many diffeerent smaller modules called methods
		 * that can help us take Strings booleans vasically all types of data from
		 * the keyboard
		 * 
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your name");
		//message will be displayed to the user to input in the console
		String name=input.next();
		//Activates the java program to take the input from the keyboard
		//and stores it inside the name variable
		System.out.println("Hello "+name+", don't be confused!hubert");
		//prints whatever name user enters on the keyboard on the console
		
	}

}
