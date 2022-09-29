package com.syntax.class004a;

import java.util.Scanner;

public class HW05CityTemp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Hiya, what city are ya from?");
		String city=scan.nextLine();
		System.out.println("What is the temperture in Fahrenheit right now?");
		float f=scan.nextFloat();
		float c=(f-32)*5/9;
		System.out.println("The temperature in the "+city+ " is "+c+" Celsius.");
	} 

}
