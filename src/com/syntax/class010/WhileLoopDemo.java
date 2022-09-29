package com.syntax.class010;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int time = 10;
		
		if (time<12) {
			System.out.println("good morninginsideif  ");
		}
		
		while (time<12) {
			System.out.println("goodmorningwhile2"); //infiniate loop
			time++; //this will print gm1, the gm2, then stop at gm2
		}
		
	
	}

}
