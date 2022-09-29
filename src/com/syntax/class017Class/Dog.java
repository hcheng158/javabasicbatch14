package com.syntax.class017Class; 

public class Dog {

	//Create a Dog Class and create 3 different objects of it: 
	//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	
	//state
	//attributes/properties/fields
	String breed;
	char sex;
	String name;
	String color;
	String build;
	Boolean play;
	double weight;
	int age;
	//these are the behaviors of a day
	void bark() {
		System.out.println("is barking.........");
	}
	void sleep() {
	System.out.println("is sleeping..........");
	}
	void play() {
		System.out.println("is playing fetch..........");
		}
	void eat() {
		System.out.println("is begging for a doggie treat!..........");
		}
	public static void main(String[] args) {
	//	Employee emp2=new Employee();
	//	emp2.name="Adam";
		Dog dog1= new Dog();
		dog1.breed="Husky";
		dog1.sex='M';
		dog1.name="Bailey";
		dog1.color="Black";
		dog1.build="F";
		dog1.play=true;
		dog1.weight=27;
		dog1.age=5;
		System.out.println("2 things that Bailey likes to do is: ");
		dog1.sleep();
		dog1.eat();
		
		
		Dog dog2= new Dog();
		dog2.breed="Bulldog";
		dog2.sex='F';
		dog2.name="Lucy";
		dog2.color="Black";
		dog2.build="F";
		dog2.play=true;
		dog2.weight=47.01;
		dog2.age=6;
		System.out.println("2 things that Lucy likes to do is: ");
		dog2.sleep();
		dog2.eat();
		
		
		Dog dog3= new Dog();
		dog3.breed="Labrador";
		dog3.sex='F';
		dog3.name="Cloe";
		dog3.color="Black";
		dog3.build="Fat";
		dog3.play=true;
		dog3.weight=95.15;
		dog3.age=7;
		System.out.println("1 things that Lucy likes to do is: ");
		dog3.play();
	}
}
	
	
	
	

