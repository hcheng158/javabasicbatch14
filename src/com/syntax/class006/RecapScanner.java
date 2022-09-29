package com.syntax.class006;

import java.util.Scanner;

// control shift + o
public class RecapScanner {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=scan.next(); //capturing string
		System.out.println("How old are you "+name);
		int age=scan.nextInt();
		
		System.out.println("Nice to meet your "+name+ ". you are "+age+" years old");
	
		System.out.println("End of line");
		
		System.out.println("How much money do you have "+name);
		double money=scan.nextDouble();
		System.out.println(name+ " has $"+money);
		
		System.out.println(name+", what is your grade");
		char grade=scan.next().charAt(0);
		System.out.println(name+", you are a "+grade+" student");
		System.out.println("Please enter another name");
	   // name=input.next();
	    System.out.println("New name is "+name);

		System.out.println("Your new name is "+name);
	}

}
