package com.syntax.class004a;

import java.util.Scanner;

public class HW03LoanAmount220829 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How much of a loan do you need?");
		int loan=scan.nextInt();
		if(loan<=200000) {
			System.out.println("No problem, we can loan you the money of that amount!");
		}else {
			System.out.println("I'm sorry that loan amount is too high of a risk for us! Try again!");
			}
	}

}
