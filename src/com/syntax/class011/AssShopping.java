package com.syntax.class011;

import java.util.Scanner;

public class AssShopping {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item = scan.nextLine();

		System.out.println("What is the price of the item?");
		double price = scan.nextDouble();

		double money;
		double total = 0;
		System.out.println("Please pay for your " + item);

		do {

			money = scan.nextDouble();

			total += money; // accumulate all money
			double need;
			double change;

			if (total < price) {
				need = price - total;
				System.out.println("You need to pay $" + need + " more.");
			} else if (total >= price) {
				change = total - price;
				System.out.println("Here is your change " + change);
				break;
			}

		} while (total != price);

		System.out.println("Thank you for shopping");
	}
}
