package com.syntax.class010;

import java.util.Scanner;

public class HW006CoffeeCost {

	public static void main(String[] args) {
		double cost=7.34;
		double price=0.00;
		Scanner scan = new Scanner(System.in);
		
do {		
		System.out.println("Pay for your coffee! Enter the price!");
		price = scan.nextDouble();
		
		if(cost < price) {
			System.out.println("Please give less");
		} else if (cost > price) {
			System.out.println("Please give more");
		}
	} while (price != cost);
			System.out.println("Enjoy your coffee");
	}
}



