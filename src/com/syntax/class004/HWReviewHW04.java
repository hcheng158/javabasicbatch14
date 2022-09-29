package com.syntax.class004;

public class HWReviewHW04 {

	public static void main(String[] args) {
		/*
		 *  even or odd
		 *  if you divide by 2, if there is a remainder
		 *  using the modulas moduladar
		 *  if we take the modulas of a number by 2 and the answer is 0 it is always an even number
		 *  otherwise it is an odd number
		 */

		int number=15;
		System.out.println(15%2);
		
		if (number%2==0) {
			System.out.println("The number is even!");
		} else {
			System.out.println("the number is odd!");
		}
	}

}
