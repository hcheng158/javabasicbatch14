package com.syntax.class006;

public class RecapNestedIf {// GREAT EXAMPLE

	public static void main(String[] args) {
		boolean allergy = true;
		String allergyType = "pollen";

		// to format code use control+shift+'F'
		if (allergy) { // inner if statement code
			System.out.println("Let's check what allergy you have");

			if (allergyType.equalsIgnoreCase("Pollen")) {// ladder else if statement
				// equalignorecase
				System.out.println("Try to stay indoors when trees are in motion");
			} else if (allergyType.equals("Peanuts")) {
				System.out.println("Please stay away from peanut products");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("We need to do some more allergy tests, to determine what else you have!");
			}

		} else { // belongs to the outer if
			// typing your outer else first
			System.out.println("You are lucky! You don't have the 3 most common allergies");
		}
	}

}
