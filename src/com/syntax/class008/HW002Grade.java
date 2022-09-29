package com.syntax.class008;

import java.util.Scanner;

public class HW002Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your latest grade:");
		String grade=scan.next();
		String explanation=null;

		switch (grade) {
		case "A":
			explanation = "excellent";
			break;
		case "B":
			explanation = "good";
			break;
		case "C":
			explanation = "average";
			break;
		case "D":
			explanation = "bad";
			break;
		case "F":
			explanation = "terrible";
			break;
		case "default":
			explanation = "Unknown";
			break;
		}
		System.out.println("You received a letter grade of "+grade+" which is "+explanation+".");

	}
}
