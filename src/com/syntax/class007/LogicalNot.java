package com.syntax.class007;

public class LogicalNot {

	public static void main(String[] args) {
		// logical NOT reverses the condition
		//Logical AA && - all contidition MUST be true for locial AND return TRUE
		//		
		boolean boo=!true; //reverse the condtion so it should be false
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1); //reverse so it's true
		
		boolean rain=true;
		
		if(!rain) { //because rain is false, it means it's true
			System.out.println("I'll go for a walk");//so I'll go for a walk
		}
		
		String day="Monday";
		if(!day.equals("Sunday")) {
			System.out.println("Today is not Sunday");//will be skipped
		}
		System.out.println("++++++++++++++++++++++");
		boolean checkboxSelected=false;
		
				if(!checkboxSelected) {
					System.out.println("I will click and select it");
				}
		
		int num=10;
		if(num!=10);
		
				
		System.out.println("End of the program");
		
 	}

}
