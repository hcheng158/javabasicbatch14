package com.syntax.class005;

public class NestedIf {

	public static void main(String[] args) {
	int money=10;
	
	if(money>10) {//outer condition
		System.out.println("Let's buy some eggs");
		
	int noOfEggs=2;
	if(noOfEggs>0) 
		System.out.println("lets boil the eggs");
	
	}//java knows it's dependant on that separate condition
	
	}
}
