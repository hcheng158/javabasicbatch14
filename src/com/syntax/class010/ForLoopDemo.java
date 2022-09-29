package com.syntax.class010;

public class ForLoopDemo {

	public static void main(String[] args) {
		for (int i=1; i<=20; i++) {
			System.out.println(i);
		}
		System.out.println("+++++++++++++");
		for (int a=1; a<=5; a++) {
			System.out.println("hello");
		}
		System.out.println("+++++++++++++");
		//print 1-20
		for (int b=1; b<=20; b++) {
			System.out.print(b+", ");
		}
		System.out.println("+++++++++++++");
		System.out.println("+++++++++++++");
		//30 to 10
		for (int c=30; c>=10; c--) {
			System.out.print(c+", ");
		}
		System.out.println("+++++++++++++");
		System.out.println("+++++++++++++");
		//evens 1=10
		for (int d=0; d<=10; d+=2) {
			System.out.print(d+", ");
			System.out.println("+++++++++++++");
			System.out.println("+++++++++++++");
		}
		for(int e=10; e<=25; e+=5) {
			System.out.println(e+", ");
			System.out.println("+++++++++++++");
		}
		//1+2+3+4+5+6=21
		int sum=0;
		for(int f=1; f<=6; f++) {
			sum+=f;
		}
		System.out.println(sum);
	
}
	}
