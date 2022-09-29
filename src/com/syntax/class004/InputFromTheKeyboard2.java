package com.syntax.class004;

import java.util.Scanner;

public class InputFromTheKeyboard2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a full sentence!");
		String sentence=input.nextLine();
		System.out.println(sentence);
	}

}