package com.syntax.class008;

import java.util.Scanner;

public class Replit005 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter your mark");
			int mark=scan.nextInt();
			
			if ((mark>0) && (mark<=25)) {
				System.out.println("Your grad is F");
			}else if ((mark>25) && (mark<=45)) {
				System.out.println("Your grad is E");
			}else if ((mark>45) && (mark<=50)) {
				System.out.println("Your grad is D");
			}else if ((mark>50) && (mark<=60)) {
				System.out.println("Your grad is C");
			}else if ((mark>60) && (mark<80)) {
				System.out.println("Your grad is B");
			}else if (mark>=80)  {
				System.out.println("Your grad is A");
			}else
				System.out.println("Please enter valid mark");
		}

}
