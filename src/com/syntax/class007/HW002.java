package com.syntax.class007;

import java.util.Scanner;

public class HW002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = scan.next();
		String timeOfMonth = null;

		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			timeOfMonth = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			timeOfMonth = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			timeOfMonth = "Fall";
		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			timeOfMonth = "Winter";
		}
		System.out.println(timeOfMonth);
	}

}
