package com.syntax.class015;

import java.util.Arrays;

public class Leture003 {

	public static void main(String[] args) {
		//creates an array store elements in the array
		//then with help of another array adds all of the elements
		
		int size=10;
		//int [] arr=new int[size];
		int [] arr=new int[10];
		arr[0]=10;
		arr[1]=10;//this is a bad idea especially if it's 100 or 1000 variables
		int start=11;
		for (int i=0; i<arr.length; i++) {
			
			arr[i]=start;
			start--;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("+++++++++++++++");
		int sum=0;
		for(int num:arr) {
			sum=sum+num;
		}
		System.out.println(sum);
	
	}

}
