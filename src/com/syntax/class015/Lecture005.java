package com.syntax.class015;

public class Lecture005 {

	public static void main(String[] args) {
		String[] individualsInRoom1=new String[] {"Sabej", "Shah","Mina"};
		String[] individualsInRoom2=new String[] {"Roman", "Mina"};
		//an 20 array that will store 3 single d array
		String[] individualsInRoom3=new String[] {"Asad", "Priyasri","Ali"};

		String[][] room=new String[3][];
		
		
		room[0]=individualsInRoom1;
		room[1]=individualsInRoom2;
		room[2]=individualsInRoom3;
		
		System.out.println(room[1][1]); //Mina
		System.out.println(room[2][2]); //Ali
		}
		
		
	}


