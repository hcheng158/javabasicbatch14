package com.syntax.class010;

import java.util.Scanner;

public class HW005GoodAftenoonName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.next();
		for (int a=1; a<=3; a++) {
			System.out.println("Good afternoon "+name);
	}
	}
}
