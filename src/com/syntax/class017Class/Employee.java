package com.syntax.class017Class;

public class Employee {

	//public static void main(String[] args) {
	String name;
	String id;
	String department;
	double salary;
	String shift;
	
	void work() {
		System.out.println(name+" is working on shift " +shift);
	}
	
	void takeLeaves() {
		System.out.println(name+ " is going on leaves");
	}
	public static void main(String[] args) {
		Employee empl=new Employee();
		empl.name="john";
		//emp1.id="3424";
		empl.department="IT";
		empl.shift="evening";
		empl.salary=200000;
		empl.work(); //calling method
		empl.takeLeaves();
		
		Employee emp2=new Employee();
		emp2.name="Adam";
		emp2.department="Sales";
		emp2.id="3424";
		emp2.salary=150000;
		emp2.work(); //calling method
		emp2.takeLeaves();
	}
	
}


