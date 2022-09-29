package com.syntax.class005;

import java.util.Scanner;

public class RepliCode {

	public static void main(String[] args) {
		
			System.out.println("Please enter your gender: M or F");
		      Scanner scan=new Scanner(System.in);
		      char gender=scan.next().charAt(0);
		      System.out.println("Please enter your age"); 
		      int age=scan.nextInt();
		   // System.out.println(gender);
		   // System.out.println(age);
		    if(age>=25) {
		    	
		    	
		    	if(gender=='F') {
		    		System.out.println("Woman");
		    	}else {
		    		System.out.println("Man");
		    	}
		    }else {
		    	
		    	if(gender=='F') {
		    		System.out.println("Girl");
		    	}else {
		    		System.out.println("Boy");
		    	}
		    	
		    }
		    
	}	
}


