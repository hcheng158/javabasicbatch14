package com.syntax.class014GROUP;

public class Switch006 {

	public static void main(String[] args) {
		{
	        int i = 20;
	        int j = 10;
	        i = i + j; //20+10=30 = i
	        j = i - j; //30-10=20 =j
	        i = i - j; //30-20=10 = i
	        System.out.println("After the switch..."
	                           + " i = " + i + ", j = " + j);
	    }
	}
}