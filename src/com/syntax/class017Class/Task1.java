package com.syntax.class017Class;

import java.util.Scanner;

public class Task1 {

/*
 * tore username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
 */
	
	
	public static void main(String[] args) {
		String userName="user1";
		String password="pass1234";
		String confirmPassword="pass1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please ener a user name: ");
		userName=scan.next();
		System.out.println("Please Enter the Password: ");
		password=scan.next();
		System.out.println("Please Enter the Password again: ");
		confirmPassword=scan.next();
		
		if(userName.isEmpty() || password.isEmpty()) { 
		System.out.println("Username and Password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Username can't be contained in password");
		}else if(!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		
	}
}
	
	

	
