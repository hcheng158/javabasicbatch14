package com.syntax.class004;

public class NestedIfCondition2 {

	public static void main(String[] args) {
		double moneyInMyAccount=40000
				;
		String season="Spring";
		
		if(season.equals("Spring")) 
		{
		
		
		
			if(moneyInMyAccount>30000) 
			{
				System.out.println("Let's go on Vacation!");
			}
			else 
			{
				System.out.println("I need to save more money!");
			}
		
		}
	}

}
