package com.syntax.class008;

import java.util.Scanner;

public class HW005Height {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How tall are you in inches?");
		int height = scan.nextInt();
		
		if (height<60) {
			System.out.println("Yeah, you're kind of short");
		} else if (height>=60 && height<=72) {
			System.out.println("Ok, you're Medium");
		} else if (height>=73) {
			System.out.println("You're tall!");
		
		}
			
		
	}

}
