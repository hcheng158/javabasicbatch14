package com.syntax.class014;

public class Hw005ArrayString {

	public static void main(String[] args) {
		String[] week= {"Monday", "Sunday", "Tuesday", "Thursday", "Friday"};
		for(String day:week) {
			System.out.println(day);
			//System.out.println(week); //doesn't work syntax
			if (day=="Sunday") {
				System.out.println("FUNDAY!");
			}else if(day.equals("Friday")) {
				System.out.println(day+ " is a relaxing day!");
			}else {
				System.out.println(day+" is a boring day!");
				}
			}
		}
	
	}


