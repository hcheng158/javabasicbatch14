package com.syntax.class007;

public class Switch {

	public static void main(String[] args) {
		//matching cases must be same data type as a variable in switch
		//no duplicated case in switch
		// can't us ||
		//limitiations of the SWITCH CASE
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case'N':
			answer="No";
			break;
		case'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}//must store correct values in the numberic data types
		//arithmetic options
		//swtich case cannot use logical operators
		//switch case can't use relational operators
		//CANNOT work with boolean values
		//CANNOT use double/float/ and long
		System.out.println(answer);	
		}		
		
}


