package com.syntax.class017Class;

public class StringDemo5 {

	public static void main(String[] args) {
		String str="I love java programming";
		System.out.println(str.charAt(2));
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)==' ')) {
			System.out.println(str.charAt(i));
			}
			//charAt returns us the character at a specific index
			
		}
	}

}
