package com.syntax.class011;

public class LectureContinue2 {

	public static void main(String[] args) {
		for (int i = 1; i <=20 ; i++) {
			if (i == 3 || i==7 || i==11) {
				continue;
			}
			System.out.print(i+" ");
		
		}
	}
}

//continue = continues to the next interation/cycle
//moment Java sees contine = it goes back to the beginning of the loop
//it usually used inside of some type of conditions
