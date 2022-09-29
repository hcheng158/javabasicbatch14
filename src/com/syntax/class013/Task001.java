package com.syntax.class013;

public class Task001 {

	public static void main(String[] args) {
		char[] grade= {'A', 'B', 'C', 'D', 'F'};
		System.out.println(grade[1]);
		for(int g=0; g<1; g++) {
			System.out.println(grade[1]);
		}
		
		//System.out.println(drinks[2]); //juice
		//String[] drinks= {"fanta", "milk", "juice", "lemonade"};
		
		String[] names=new String[5];
		names[0]="Hubert";
		names[1]="Vera";
		names[2]="Shah";
		names[3]="Roman";
		names[4]="Guljan";
		System.out.println(names[0]+" "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]);
		for(int n=0; n<names.length; n++) {
			System.out.print(names[n]);
		}
	
		//String[] namess= {"Hubert", "Vera"};
		//System.out.println(namess);
		
		String[] iceCream= {"vanilla", "chocolate", "pistashio", "kulfi", "mango"};
		System.out.println(iceCream[0]);
		System.out.println(iceCream[1]);
		System.out.println(iceCream[2]);
		System.out.println(iceCream[3]);
		System.out.println(iceCream[4]);
		
		//how to get all of the values? USE A LOOP
		for(int i=0; i<iceCream.length; i++) { //length will grab the entire number of array.
			System.out.println(iceCream[i]);
		}
		
		char[] letters= {'A', 'B', 'C', 'D', 'F'};
		for (int l=0; l<letters.length; l++) {
			System.out.println(letters[l]);
		for(char cap:letters) {
			System.out.println(cap);
		}
		}
		
	
	}
	

}
