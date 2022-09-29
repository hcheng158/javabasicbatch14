package com.syntax.class003;

public class TypeCasting {

	public static void main(String[] args) {
		//type casting means converting 1 value
		//type= data type casting= converting
		//
		byte box1=127;
		short box2=3333;
		int box3=343434343;
		long box4=434343434;
		float box5=3432423;
		double box6=34343;
		
		int number=(int)15.2;
		System.out.println(number);
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		short biggerBox=box1;
		
		long box7=box1; //we can do this because box 7 is larger than box 1
		float box8=(float)box6; //we can't do it because box 6 is a double
		//as box 6 is larger, we need type casting to assign the value
		char a=(char)63; //this will outout the ascii table
		System.out.println(a);
		
		
	}

}
