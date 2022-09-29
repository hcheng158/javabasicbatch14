package com.syntax.class014;

public class HW004LargestNum {

	public static void main(String[] args) {
//4. From an array of integer elements find the largest number.
		int[] num = { 100, 0, 10, 20, 30, 40, 50, 5000, -200, -200 };
		int largestnum = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largestnum) {
				largestnum = num[i];
			}
		}
		System.out.println(largestnum);
		System.out.println("++++++++++++++++++");

		largestnum = num[0];// reseting the number to starting with zero

		for (int n : num) {
			if (n > largestnum) {
				largestnum=n;
			}
		} System.out.println(largestnum);
	}
}