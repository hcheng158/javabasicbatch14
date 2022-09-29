package com.syntax.class017Class;

public class StringDemo7 {

	public static void main(String[] args) {
		String str="I am always consfused";
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		//should print '2'
		System.out.println(str.substring(5));
		//outputs from index 5 and skips the first 5
		
		System.out.println(str.substring(5,11));
		
		int num=121232434;
		String numStr=String.valueOf(num).substring(1,3);
		System.out.println(numStr);
		num=Integer.parseInt(numStr);
		System.out.println(num);
	}

}
