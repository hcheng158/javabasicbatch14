package com.syntax.class002;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// +, -, *, /, % for reminders
		//for numeric values
		int a=900;
		int b=100;
		int c=10;
		int d=3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println("--------------------------");
		
		int sum=(a+b);
		int sub=(c-d);
		int remider=(c%d);
		int div=(c/d); //10/3=3
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(remider);
		System.out.println("Divison of integers is = "+div); //3
		
		int e=10;
		int f=5;
		
		
		System.out.println("division - "+e/f); //2
		System.out.println("reminder = "+e%f); //0 because there is no reminder
		System.out.println(20%9);

		double num1=10;
		double num2=3;
		
		System.out.println("Division of double = "+num1/num2); //3.3333333333
		System.out.println("--------------------------");

		float number1=10.0F;
		float number2=3.0f;
		System.out.println("Division of float = "+number1/number2);
		System.out.println(number1%number2); //reminder - % - mod operator
		System.out.println("reminder examples");
		System.out.println(16%5); //1
		System.out.println(16%4); //0
		System.out.println(10+10/10);
		System.out.println((10+10)/10);
		
	}

}
