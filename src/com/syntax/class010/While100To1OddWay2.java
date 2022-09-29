package com.syntax.class010;

public class While100To1OddWay2 {

	public static void main(String[] args) {
		int i = 99;
		
		while (i<=100 && i>=0) {
			System.out.print(i+", ");
			i -=2;
		}
	}

}
