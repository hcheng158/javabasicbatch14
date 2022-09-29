package com.syntax.class008;

import java.util.Scanner;

public class HW006WeekendWeekday {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input what day is. Use Monday=1, Tuesday=2...Sunday=7");
		int day=scan.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("Weekday");
		} else if (day>=6 && day<=7) {
			System.out.println("Weekend");
		} else {
			System.out.println("Invalid");
		}
	}
}


