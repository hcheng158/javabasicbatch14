package com.syntax.class002;

public class Task01 {

	public static void main(String[] args) {
		String firstname="Hubert";
		String lastname="Cheng";
		char lettera= 'A';
		char letterb= 'B';
		String city="Los Angeles";
		String state="California";
		String phone="(555)555-1234";
		
		System.out.println("My name is "+firstname + ", and my last name is "+lastname + ".");
		System.out.println("I am an "+lettera +" student.");
		System.out.println("I live in the city of "+city+ ", "+state+'.');
		System.out.println("And my phone number is "+phone+".");
		
		city="Tijuana";
		state="Mexico";
		phone="(555)111-2222";
		
		System.out.println("My name is "+firstname+lastname+" and I moved to a new city "+city+","+state+". ");
		System.out.println("My new phone number is "+phone+".");
		
		//Rules for Identifiers=names (variables, methods, and other name of identifiers).
		//1. cannot use keywods as identifiers
		//String new = "hello"; = ERROR
		//2. Can't have spaces in identifiers
		// String lastname="Smith";
		//3. Identifiers cannot start with numbers
		//int 1number=123; = ERROR can't start with a number
		//int number1=123; this is fine
		//4. Identifiers can't contain any special characters except for dollar signs $ and underscore _
		//Identifers are just a name
		//Identifers Can't contain spaces
		//Nameing conventions: 
		
		
		
		boolean hello$_=true;
		double $price=9.98;
		float _price1=1.99F;
		char $cash$='$';
		
		//Preferences for naming conventions
		/* Class should start with Uppercase and follow Camelcases
		 * Automation engineers
		 * Variables should start with lowercase and follow camel cases
		 * camelCasing is what we should obey
		 * When naming packages 'HelloWorld'
		 */
		String weatherWarm="warm";
		String weatherCold="cold";
		String myWeather="soso"; //This is industry standards
		
		
		
		
	}

}
