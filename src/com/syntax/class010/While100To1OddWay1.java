package com.syntax.class010;

public class While100To1OddWay1 {

	public static void main(String[] args) {
		int i = 100;
		while (i >= 1 && i <= 100) {
			if(i%2 != 0) {
			System.out.print(i+", ");
			}
			i--;
			
		}
	}

}
