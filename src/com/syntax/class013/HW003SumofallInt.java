package com.syntax.class013;

public class HW003SumofallInt {

	public static void main(String[] args) {
		//int[] num= {1,2,3,4,5};
		//for(int bum:num) {
		//System.out.print(bum);
		
		  int[] ia = new int[5];
	        for (int i = 0; i < ia.length; i++) ia[i] = i;
	        int sum = 0;
	        for (int e : ia) sum += e;
	        System.out.println(sum);
		
		}

	}


