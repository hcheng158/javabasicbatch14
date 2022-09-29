package com.syntax.class002;

public class NonPrimitiveDataTypeString {

	public static void main(String[] args) {
		//String is a just 1 example of non primitive data type
		String name="Asma";
		String address="213 Palm Ave.";
		String phone="111-222-5555";
		String fruit="apple";
		double price=1.99;
		fruit="mango";
		price=5.99;
		char dollar = '$';
		
		
		//string is a class non primitive data type. A string is anything inside of a double quote
		int age=17; 
		//String age="17"; //anything you put inside "" becomes a string not a number
		String character="A";
		//System.out.println(); // syso+control+space to println statement short cut
	
		System.out.println(name);
		
		//My name is Asma....use concatenate 
		
		System.out.println("My name is +name");
		System.out.println("My name is "+name);
		//make sure the space is enters before the end of the ""
		System.out.println("My name is "+name + "," + address + "," + phone);
		System.out.println(name+ " is "+age+"."); //this will display
		//The prince of the apple is 1.99
		System.out.println("The price of the "+fruit+ " is "+dollar+price);
		/*to attach any value(int, double, boolean, char, string, etc
		*to a String we use +
		* + next to the String acts as Concatenation
		*/
		

	}

}
