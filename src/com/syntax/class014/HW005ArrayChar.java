package com.syntax.class014;

public class HW005ArrayChar {

	public static void main(String[] args) {
		// 5. Create an array to store char values and then print those in reverse order
		char[] letters = {'R', 'E', 'D', 'R', 'U', 'M'};
		
		
		for(int i= letters.length - 1; i>=0; i--) {
			System.out.println(letters[i] + " ");
		}

	}

}
