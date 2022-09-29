package com.syntax.class017Class;
//Create a Class “Phone”. Create 3 Objects of it: 
//iPhone, Pixel, Samsung with specific  attributes and behaviors.


public class Phone {
	//attributes
	String make;
	String model;
	String color;
	int year;
	int storage;
	double size;
	boolean cheap;
	void call() {
		System.out.println("calling......");
	}
	
	void takePicture() {
		System.out.println("Taking pictures");
	}

	public static void main(String[] argh) {
		//name of Class variable name= new Name of class();
		Phone iphone=new Phone();
		//after we have this object, then we have these attributes
		iphone.make="Apple";
		iphone.model="iphone 14 Pro Max";
		iphone.color="Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		System.out.println("Make "+iphone.make+" Model"+iphone.model);
		iphone.call();
		
		System.out.println("+++++++++++++++++++");
		
		Phone samsungPhone=new Phone();
		samsungPhone.make="Samsung";
		samsungPhone.model="S22 Ultra";
		samsungPhone.color="Grey";
		samsungPhone.year="2021";
		samsungPhone.storage=256;
		samsungPhone.size=6.7;
		samsungPhone.cheap=false;
		System.out.println(iphone.make);
		System.out.println(samsungPhone.make);
		
		Phone pixelPhone=new Phone();
		pixelPhone.make="Google";
		pixelPhone.model="Pixel 7 Pro 5G";
		pixelPhone.color="White";
		pixelPhone.storage=256;
		pixelPhone.size=6.9;
		pixelPhone.cheap=false;
		System.out.println(pixelPhone.make);
	
		
		
	}

}
