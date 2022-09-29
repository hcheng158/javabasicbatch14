package com.syntax.class014;

public class HW003Part1 {
	public static void main(String[] args) {
	//how to calculate the sum of an array
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum=0;
		System.out.println("Sum of the numbers in this array is: ");
		
		for (int i=0; i< numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}	
}
