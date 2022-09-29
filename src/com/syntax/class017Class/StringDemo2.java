package com.syntax.class017Class;

public class StringDemo2 {

	public static void main(String[] args) {
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName); 
		//mostly this is used
		System.out.println(firstName.concat(lastName));
		//alternate way...longer way
		System.out.println(firstName.concat(" ").concat(lastName));
		
		String str=" ";
		System.out.println(str.isEmpty());//true boolean
		//but if you have a space inbetween the space it will be true;
		System.out.println(str.isBlank());
		
		
	}

}
