package com.syntax.class008;

import java.util.Scanner;

public class Replit010 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your favorite car make");
			String car = scan.next();
			String carType=null;
			
			switch (car) {
			case "BMW":
				carType = "carOrigin = german car";
				break;
			case "Toyota":
				carType = "carOrigin = japanese car";
				break;
			case "Maserati":
				carType = "carOrigin = italian car";
				break;
			default:
				carType = "carOrigin = unknown";
				break;
	}
			System.out.println("Your favorite car is "+carType);
	}
	
}
