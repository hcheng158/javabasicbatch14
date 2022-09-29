package com.syntax.class014;

public class HW003Part2 {

	public static void main(String[] args) {
		//how to calculate the sum of an array
			int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
			int sum=0;
			System.out.println("Sum of the numbers in this array is: ");
			
			for (int number: numbers) {
				sum+=number;//take my sum and add these numbers
			}
			System.out.println(sum);
		}	

	}

