package com.syntax.class004;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		int x=2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please eneter your age!");
		int age=scan.nextInt();
		//we use nextInt() if we want an int type of data from the keyboard
	
		if (age<18)
		{
		System.out.println("You should study!");
		}else {
		System.out.println("You should start working!");
		}
	}

}
