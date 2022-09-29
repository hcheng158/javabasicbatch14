package com.syntax.class008;

import java.util.Scanner;

public class Replit003 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Are you thristy?");
	boolean thirsty =scan.nextBoolean();
	System.out.println("Are you sleepy?");
	boolean sleepy =scan.nextBoolean();
	if(!sleepy && (thirsty)) {
		System.out.println("drink=water");
	} else if (sleepy && thirsty) {
		System.out.println("drink=coffee");
	} else if (sleepy && !(thirsty)) {
		System.out.println("drink=tea");
	} else {
		System.out.println("drink=nothing");
	}
	}
}
