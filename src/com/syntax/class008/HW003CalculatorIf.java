package com.syntax.class008;

import java.util.Scanner;

public class HW003CalculatorIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me the value of x:");
		double x = scan.nextDouble();
		System.out.println("Please tell me the value of y:");
		double y = scan.nextDouble();
		System.out.println("Please tell me what would you like me to do using +,-,*,/ values:");
		char math = scan.next().charAt(0);
		double sum = x + y;
		double sub = x - y;
		double mul = x * y;
		double div = x / y;
		boolean wrongOperator=false; //by default boolean if false
		
		if (math == '+') {
			System.out.println(x + " + " + y + " = " + sum);
		} else if (math == '-') {
			System.out.println(x + " - " + y + " = " + sub);
		} else if (math == '*') {
			System.out.println(x + " * " + y + " = " + mul);
		} else if (math == '/') {
			System.out.println(x + " / " + y + " = " + div);
		} else
			System.out.println("Enter valid operator");
			wrongOperator=true;
	
		if (!wrongOperator) {
			System.out.println(math);
		}
	}
}
