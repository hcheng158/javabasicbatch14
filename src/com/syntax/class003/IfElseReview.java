package com.syntax.class003;

public class IfElseReview {

	public static void main(String[] args) {
		short box=167;
		byte box2=(byte)box;
		System.out.println(box2);
		//type casting is converting one datatype to another data type
		//why do I care? 
		//so we can use code that is written by someone else
		//to make out life easier
		// or when we will be working in teams we will be able to merge the code
		//What is the syntax for type casting?
		//when we are converting something something smaller to larger
		//we won't need to do anything. It happens automatically
		//We just assign the variables for example
		//int box=1234;
		//long box2=box; //this is how it works and it's called
		//implicit or widening automatically
		//
		//
		//
		
		double money=11;
		boolean isHungry=true;
		double kfcBurger=11;
		
		if (money>kfcBurger) {
			System.out.println("Yayy...I can enjoy the burger!");
		} 
		
		else 
		
		{
			System.out.println("I should make something at home :(");
		}
		
		if(true) {
			System.out.println("Lets eat something yummy");
		}
		
		else {
			System.out.println("Lets watch and do some coding from Youtube");
			
			
		}
			

		
	}
}
