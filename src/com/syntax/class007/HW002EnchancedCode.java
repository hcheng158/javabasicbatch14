package com.syntax.class007;

import java.util.Scanner;

public class HW002EnchancedCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What time is it? Use 24 hours format");
		int hour = scan.nextInt();

		String timeOfTheDay = null;

		if (hour >= 1 && hour <= 11) {
			timeOfTheDay = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			timeOfTheDay = "Afternoon";
		} else if (hour >= 16 && hour <= 20) {
			timeOfTheDay = "Evening";
		} else if (hour >= 21 && hour <= 24) {
			timeOfTheDay = "Night";
		} else {
			System.out.println("Wrong number is entered");
			timeOfTheDay = "Invalid";
		}
		System.out.println(timeOfTheDay);
	}

}
