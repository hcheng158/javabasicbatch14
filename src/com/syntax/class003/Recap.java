package com.syntax.class003;

public class Recap {

	public static void main(String[] args) {
		//string concatenation helps us combine 2 strings togtehr. 
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName+ " " + lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+city+" "+country;
		System.out.println(fullAddress);
		System.out.println("if we substract 10 from 5 we get =" +10);
		//string +int=string, 
		//substract string from a number
		String incomplete=houseNo+city;
		String step1="if we subtract 10 from 5 we get =" +10;

		System.out.println("if we subtract 10 from 5 we get"+" "+(10-5));
		
	}

}
