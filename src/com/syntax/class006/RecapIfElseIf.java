package com.syntax.class006;

import java.security.DomainCombiner;

public class RecapIfElseIf {
	

	public static void main(String[] args) {
		//shortcut to autocomplete
		//if else if use this when you multiple conditions
		
		String phone="iphone";
		if (phone.equals("iPhone")) {
			System.out.println("I want to buy it for me");
		} else if (phone.equals("Samsung")){
			System.out.println("I want to buy it for my husband");
		} else if (phone.equals("Nokia")){
			System.out.println("I want to buy it for my grandma");
		} else {
			System.out.println("That is not the phone I was looking for");
		}
	
	}
	

}
