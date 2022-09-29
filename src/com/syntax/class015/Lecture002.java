package com.syntax.class015;

public class Lecture002 {

	public static void main(String[] args) {
		String [] dresses=new String[] {"Pink Dress","Cocktail Dress", "Summer Dress", "Night Dress"};
			System.out.println(dresses.length); //3
			//3 THIS IS THE MOST COMMON METHOD
		for(int i=0; i<dresses.length;i++) {
			System.out.println("Lets try "+dresses[i]);
		}
		
		for(String dress:dresses) {
			System.out.println(dress);
		}
		System.out.println("+++++++++++++++++++");
	//	System.out.println(Arrays.toString(dresses)););
	}

}
