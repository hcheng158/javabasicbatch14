package com.syntax.class017Class;

public class PhoneTester {

	public static void main(String[] args) {
		/*
		 * if class whos object we are
		 * creating is present inside the same pacakge
		 * we don't need to import it
		 */
		
		Phone iphone=new Phone();
		iphone.call(); //to access the call function
		
		Phone samsungPhone=new Phone();
		samsungPhone.model="S23 Ultra";
		samsungPhone.make="Samsung";
		samsungPhone.year=2022;
		
		
	}

}
