package com.syntax.class016;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture002 {
	
	/* Using Scanner create an array of countries. When an
array is created, retrieve all values from it and while
retrieving those values print capital for each country.
(use 2 different loops).
*/
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter how many countries you want to process: ");
	int size=scan.nextInt();
	
	String[] countries=new String[size];
	String[] capitals=new String[size];
	scan.nextLine();
	for(int i=0;i<size;i++) {
		System.out.println("Please Enter the country name:");
		countries[i]=scan.nextLine();
		
		System.out.println("Please Enter the capital for "+countries[i]);
		capitals[i]=scan.nextLine();
		
	}
	System.out.println(Arrays.toString(countries));
	System.out.println(Arrays.toString(capitals));
	
	
	}
}
