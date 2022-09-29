package com.syntax.class008;

import java.util.Scanner;

public class HW001toLowerCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me what country are you from?");
		String country = scan.nextLine();
		String language=null;
		
		switch (country.toLowerCase()) { //.toLowerCase or .toUpperCase
		//country.equalsIgnoreCase()
		case "usa":
			language = "English";
			break;
		case "kazakhstan":
			language = "Russian";
			break;
		case "turkey":
			language = "Turkish";
			break;
			case "india":
			language = "Indian";
			break;
		case "china":
			language = "Chinese";
			break;	
		case "japan":
			language = "Japanese";
			break;		
		default:
			language = "Unknown";
			break;
			
		}
		System.out.println("You are from " +country+ " and the language you speak is " + language);

	}

}
