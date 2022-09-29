package com.syntax.class013;

public class LectureArray2 {

	public static void main(String[] args) {
		int[] nums=new int[3];
		//nums[0]=0 will be by default if you leave this blank;
		
		nums[1]=12;
		nums[2]=13;
//		nums[3]=14;
		System.out.println(nums[1]);
		
		String[] colors=new String[3];
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		//colors[3]="Yellow"; //error indexOutofBoundsException: 3
		//.out.println(colors[3]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//at com.syntax.class013.LectureArray2.main(LectureArray2.java:19)
		
	}

}
