package com.syntax.class017Class;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Java"); //proper way
		String name="javadhJHDLSLdhnd";//only works for String and Wrapper classes
		//simpler and shorter way provided by java creators
		System.out.println(str.length());
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
			
		}
	}

}
