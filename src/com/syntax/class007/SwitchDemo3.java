package com.syntax.class007;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
//we need to ask a user where he/she is from
//based on the country = defined favorite food
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country = scan.nextLine();
		String favoriteFood;

		switch (country) {
		case "usa":
			favoriteFood = "burgers and fries";
			break;
		case "Kazakhstan":
			favoriteFood = "beshparmak";
			break;
		case "Turkey":
			favoriteFood = "adana kebab";
			break;
		case "Venuzuhela":
			favoriteFood = "Arepa";
			break;
		case "India":
			favoriteFood = "chicken curry";
			break;
		case "Yemen":
			favoriteFood = "Mandi";
			break;
		case "Afghanistan":
			favoriteFood = "Qaboli Palow";
			break;
		default:
			favoriteFood = "Unknown";
			break;
		}
		System.out.println("You are from " + country + " and your favorite food is " + favoriteFood + ".");

	}

}
