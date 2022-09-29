package com.syntax.class016;

public class Lecture004Group7 {

	public static void main(String[] args) {
		//rite a java program to check whether a given
	//number is prime or not?
		
		int num=5;
		boolean isPrime=true;
		if(num > 1) {
			for(int i=2; i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		if(isPrime) {
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not Prime");
		}
		}
	}

}
