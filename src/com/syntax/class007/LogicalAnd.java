package com.syntax.class007;

public class LogicalAnd {

	public static void main(String[] args) {
		// find the largest number and then
		// find if the largest is even or odd

		int n1 = 100000;
		int n2 = 2320000;
		int n3 = 30324201;
		int largest = 0; // this is empty from top to bottom
		// it will be filled later
		// you should initialize largest first

		if (n1 > n2 && n1 > n3) {
			largest = n1;
			// if(n1&2)==0{

		} else if (n2 > n3 && n2 > n1) {
			largest = n2;
		} else if (n3 > n1 && n3 > n2) {
			largest = n3;
		}
		System.out.println(largest + " is the largest number");
		if (largest % 2 == 0) {
			System.out.println(largest + " is an even number");
		} else {
			System.out.println(largest + " is an odd number");
		}
	}
	// compiler always checks our code before giving it
	// compiler can intialize variables to it defaults valutes
	// int =0;
	// double=0.0;
	// boolean=false;
	// String and other non primitive =null;
	// double d=10;
}
