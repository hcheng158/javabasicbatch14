package com.syntax.class004a;

import java.util.Scanner;

public class HW04Licence {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are ya");
		byte age=scan.nextByte();
	 if(age>=18) {
		System.out.println("Well dog gone, I can issue you a licence! Here ya go der!");
	} else {
		System.out.println("Sorry, can't give ya a licence, but here's a driver's permit for ya!");
	}

	}
}