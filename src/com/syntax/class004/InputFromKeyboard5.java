package com.syntax.class004;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Did you solve Repl? True or false please!");
		boolean solvedAnyRepls=scan.nextBoolean();
		
		if(solvedAnyRepls)
		{
			System.out.println("How many Repls did you solve?");
			int noOfReplsSolved=scan.nextInt();
			
			if(noOfReplsSolved>=17)
			{
				System.out.println("you are doing great!");
			}else if(noOfReplsSolved>=10) {
				System.out.println("you are doing ok. But please complete them as soon as possible!");
			}else {
				System.out.println("You should solve some more repls");
			}
			
	}else 	{
			System.out.println("It's very important to learn java! Go to work!");
			}
		
	}

}
