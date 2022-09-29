package com.syntax.class005;

public class IfElseIf {

	public static void main(String[] args) {
		int number = 1000;
		
		if(number>0) {
			System.out.println("number is positive");	
		}
		else if(number<0) {
			System.out.println("number is negative");
		}
		else if (number==0){
			System.out.println("number is zero");
		} 
		else if (number==30) {
			System.out.println("number is 30");
		}
		else
		{
			System.out.println("number is not valid");
		}		

		
	}

}
