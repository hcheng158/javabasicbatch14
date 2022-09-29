package com.syntax.class011;

import java.util.Scanner;

public class AssSecretNumber {

	public static void main(String[] args) {
		int secret= 158;
		int guess=0;
		Scanner scan = new Scanner(System.in);
		do {		
			System.out.println("Guess the secret number:");
			guess = scan.nextInt();
			
			if(guess < secret) {
				System.out.println("The secret number is more");
			} else if (guess > secret) {
				System.out.println("The secret number is less");
			}
		} while (guess != secret);
				System.out.println("You guessed the secret number!");
		}
	
	
		
		
	}


