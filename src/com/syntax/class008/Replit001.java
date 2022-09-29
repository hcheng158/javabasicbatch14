package com.syntax.class008;

import java.util.Scanner;

public class Replit001 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean loan=scan.nextBoolean();
		System.out.println("What is your credit score?"); 
		int score=scan.nextInt();
		if (loan) { 
		if (score<=599) {
		System.out.println("Not eligible");
		}
			else if (score>=600 && score<=700) {
			System.out.println("Maybe eligible");
		}	else if (score>=701 && score<=800) {
			System.out.println("Eligible");
			}else if (score>=801) {
				System.out.println("Definitely eligible");
				}
		
		}else {
		System.out.println("Unknown");
		}
	}
}
