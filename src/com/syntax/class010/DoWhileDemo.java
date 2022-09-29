package com.syntax.class010;

public class DoWhileDemo {

	public static void main(String[] args) {
		int num=1;
		while(num<=2) {
			System.out.println("I am while loop");
		num++;
		}
//		System.out.println(++++++++++++++++++++);
	
		int num1=1;
		
		do {//do doesn't have a condition, it's does the block of code without anything
			System.out.println("I am do while loop");
			num1++;
			
		}while(num1<=2); //if statement doesn't print. but do loop does
	
	}

}
