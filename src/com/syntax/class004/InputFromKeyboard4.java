package com.syntax.class004;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your stupid name!");
		//takes the input
		String name=scan.next();
		System.out.println("Please Enter your sorry age!");
		int age=scan.nextInt();
		System.out.println("Hi, "+name+". You are "+age+" years old. Please live long and proper!");

	}

}
