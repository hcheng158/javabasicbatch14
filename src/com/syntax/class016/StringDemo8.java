package com.syntax.class016;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch14 is good";
		System.out.println(str.replace("good","excellent"));
		//replaces words in that syntax
		System.out.println(str.replaceAll("[a-z]", "#"));
		//replace all lower case with #####
	
	}

}
