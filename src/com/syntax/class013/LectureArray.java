package com.syntax.class013;

public class LectureArray {

	public static void main(String[] args) {
		//int a=10; //one variable can only hold one value
		//collection of values of a similar type
		//int[] b= {10,20,30,40};
		//System.out.println(b[2]);
		
		int[] arr=new int[4];
		//store elemnts inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//we store them using indexs
		System.out.println(arr[2]);
		System.out.println(arr[1]+arr[2]);
		
		//lets create an arry and store your classmates
		String[] names=new String[5];
		names[0]="Hubert";
		names[1]="Vera";
		names[2]="Shah";
		names[3]="Roman";
		names[4]="Guljan";
		System.out.println(names[1]+" "+names[0]);
	}
}
