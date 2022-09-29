package com.syntax.class015;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture004 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the number of dresses you want to buy: ");
		int noOfDresses=scan.nextInt();
		
		//double[] prices=new double[size];
		double[] prices=new double[noOfDresses];
		
		for(int i=0; i<noOfDresses; i++) {
		System.out.println("Please enter the price of dress no "+(i+1));
		prices[i]=scan.nextDouble();
		
		}
		System.out.println(Arrays.toString(prices));
	
	//limitations of enhanced for loop
	//we can only go in one direction
	//we can't skip the elements
	//we can't use enhanced for loop to update the elements in an array
	//we can only use it to access the elements
	double sum=0;
	for(double price:prices) {
		
	}
	}
}
