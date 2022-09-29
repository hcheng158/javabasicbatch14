package com.syntax.class011;

public class LectureContinue {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			// if(i==3) {
			// break;
			if (i == 3) {
				continue;
			}
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println(i);
		}
	}

}
