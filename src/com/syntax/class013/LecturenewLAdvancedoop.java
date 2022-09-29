package com.syntax.class013;

public class LecturenewLAdvancedoop {

	public static void main(String[] args) {
		//only when we deal with arrays or collections
		//we can use for each loop, enchanced for loop, advanced forloop
		String[] iceCream= {"vanilla", "chocolate", "pistashio", "kulfi", "mango"};
		//enhanced for loop
		for(String flavor:iceCream) {
			System.out.println(flavor);
		}
		System.out.println("+++++++++++++++++++");

		char[] letters= {'A', 'B', 'C', 'Z'};
		for(char let:letters) {
			System.out.print(let+" ");
		}
		System.out.println("+++++++++++++++++++");
		int[] numbers= {12,56,345,1,0,9};
		//get all elements using regular for loop
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]+" ");
		}
		for (int num:numbers) {
			System.out.print(num+" ");
		}
	
	}	
}
