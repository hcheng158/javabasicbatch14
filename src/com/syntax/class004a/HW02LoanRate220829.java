package com.syntax.class004a;

public class HW02LoanRate220829 {

	public static void main(String[] args) {
		double rate=4.5;
		int price = 190000;
		
		if(rate<=4.5) {
			System.out.println("Good news, the rates are low enough for you to buy a home!");
		if(price>=200000) {
			System.out.println("You will have to take out a loan cause the pricipal amount is high.");
		} else {
			System.out.println("The price of the home is affordable to you! Enjoy your home!");
		}
		
		} else {
			System.out.println("You will not buy a house due to high interest rates!");
			
		}

	}

}
