package com.syntax.class017Class;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		String str="I love java programming";
		//toCharArray will convert a String to
		//to an array of chars
		//
		char[] charArray=str.toCharArray();
		System.out.println(charArray[5]);
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[7]);
		
		int counter=0;
		for(char c:charArray) {
			if(c=='a') {
				counter++;
			}
		}
		System.out.println("letter a has appreared "+counter+" times");
		

	}

}
