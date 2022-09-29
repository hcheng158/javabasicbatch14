package com.syntax.class008;

import java.util.Scanner;

public class HW004CalculatorCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me the value of x:");
		double x = scan.nextDouble();
		System.out.println("Please tell me the value of y:");
		double y = scan.nextDouble();
		System.out.println("Please tell me what would you like me to do using +,-,*,/ values:");
		char math = scan.next().charAt(0);
		double ans=0;
						
		switch (math) {
		case '+':
			ans=x+y;
			break;
		case '-':
			ans=x-y;
			break;
		case '*':
			ans=x*y;
			break;
		case '/':
			ans=x/y;
			break;
		default:
			System.out.println("Invalid! Unable to compute.");
			ans=0;
		}
		System.out.println("The answer is "+ ans);
	}

}
