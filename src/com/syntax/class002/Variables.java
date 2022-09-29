package com.syntax.class002;

public class Variables {

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
		
		System.out.println("My name is "+firstname+" "+lastname+" and I moved to"+" "+city+","+state+". ");
		System.out.println("I am now a "+letterb+" student(sorry about that).");
		System.out.println("My new phone number is "+phone+".");
		
		
		
	}

}
