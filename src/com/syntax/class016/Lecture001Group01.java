package com.syntax.class016;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture001Group01 {

	public static void main(String[] args) {
		/*
		 * using scanner ask the user about the size of the array
		 * create an array of the size. 
		 * After the array is created, calculated
		 * the sum of all stored elements in that array
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of the array: ");
		int size = scan.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++ ) {
			System.out.println("Please enter an int number: ");
			arr[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));//will display the entire array in brackets
		int sum=0;
		for(int num:arr) {
			sum+=num;//adds all of the nums in the array
		}
		System.out.println("Sum of all the number from the array is "+sum);

	}

}

		


