package com.syntax.class010;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String answer;
		do {
		System.out.println("did you get a job?");
		answer=scan.next();
		} while (!answer.equals("yes"));
		
		System.out.println("Congrats man!");
	}

}
