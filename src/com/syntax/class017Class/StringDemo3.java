package com.syntax.class017Class;

public class StringDemo3 {

	public static void main(String[] args) {
		String str=" i love java ";
		System.out.println(str);
		
		System.out.println(str.trim());
		//trims the spaces in a string
		String str2="Java is Very easy";
		System.out.println(str2.startsWith("J"));
		//"J" is true, but "j" is false
		System.out.println(str2.endsWith("j"));
		//doesn't end with j, ends with y so it's false
		System.out.println(str2.contains("very"));
		//'very' is in the string so it's true
		System.out.println(str2.toLowerCase().contains("very"));
		//everything is converted to lowercase, 
		//then checks Very. so Very=very=true
		//this is called METHOD CHANGING

	
	}

}
