package com.syntax.class014;

public class Review001 {

	public static void main(String[] args) {
		//array - container object or objects that stores
		//that holds multiple values
		//same type. why? saves time especially a lot of data
		int[] nums=new int[4]; //4 elements. fixed in size
		//elements are static
		nums[0]=10;
		nums[1]=20;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]); //defaulted to 0 because it isn't assigned
		//System.out.println(nums[4]); //java.lang.ArrayIndexOutOfBoundsException:
		// nums.length //tells us how many elements
		//using a for loop, why not while loop? there will be a fixed numbers
		
		//for(int i=0; i<num.legnth; i++) {
		//	System.out.println(nums[i]);
		//}
		
		for(int num : nums) {
			System.out.println(nums[num]);
		}
	}
}
