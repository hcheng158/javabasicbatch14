package com.syntax.class010;

public class shortHandOperators {

	public static void main(String[] args) {
		int i=10;
		i=i+9;
		
		System.out.println(i); //19
		
		i=i-5;
		System.out.println(i); //14
		
		i=i*2;
		System.out.println(i); //28
		
		int a=10;
		a+=9;
		System.out.println(a); //19
		a-=5;
		System.out.println(a); //14
		a*=2;
		System.out.println(a); //28
		a-=10;
		System.out.println(a); //18
		a%=4;
		System.out.println(a); // remainder 2
		a/=2;
		System.out.println(a); //1
		a+=19;
		System.out.println(a); //20
		a++;
		System.out.println(a); //21
		a--;
		System.out.println(a); //20
	}

}
