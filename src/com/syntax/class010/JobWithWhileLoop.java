package com.syntax.class010;

import java.util.Scanner;

public class JobWithWhileLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String answer; 
		System.out.println("Did you get a job1?");
		answer = scan.nextLine();
		while(!answer.equals("yes")) {
			System.out.println("Did you get a job?");
			answer = scan.nextLine();
		} 
			System.out.println("Finally!");
		}
	}

