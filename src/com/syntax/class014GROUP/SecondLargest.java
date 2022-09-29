package com.syntax.class014GROUP;

public class SecondLargest {

	public static void main(String[] args) {
		int num[] = { -77, 127, 6, 14, 3, 21, 20, 62, 41, 85, 33, 0, -10 };
		int largest = num[0];
		int second = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				second = largest;
				largest = num[i];
			} else if ((num[i] < largest && num[i] > second) || largest == second) {
				second = num[i];
			}
		}
		System.out.println("Largest number is: " + largest);
		System.out.println("Second number is: " + second);
	}
}