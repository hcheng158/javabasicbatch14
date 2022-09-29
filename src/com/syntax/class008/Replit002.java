package com.syntax.class008;

import java.util.Scanner;

public class Replit002 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two strings:");
		String word1=scan.next();
		String word2=scan.next();
		//System.out.println(word1+word2);
		System.out.println("Please enter two numbers");
		int int1=scan.nextInt();
		int int2=scan.nextInt();
		if((int1==int2) && (word1==word2)) {
			System.out.println("AND");
			}
		if((int1==int2) || (word1==word2)) {
			System.out.println("OR");
			}
		if((int1!=int2) && (word1!=word2))	{
			System.out.println("NONE");
			}
	}

}
