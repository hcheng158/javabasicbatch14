package com.syntax.class004;

public class NestedIfConditions {

	public static void main(String[] args) {
		int time=9;
		String day="Monday";
		/* it is called outer if condition if it is true
		 * then only inner contiions will be chekced if it is
		 * false, nothing from inner if condition will
		 * be executed. it is like the main door
		 * if the main door is closed, we can't enter the
		 * building
		 */
		
		if(day.equals("Monday")) { //outer if condition
			//as string is a non primitive we can't use == sign
			//we have to use.equals
		if(time>7) {
			System.out.println("Let's go to the office");//inner
			}
		if(time<6) {
			System.out.println("Let's sleep more");
			}
		}
	}

}
