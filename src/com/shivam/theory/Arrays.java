package com.theory;

public class Arrays {

//	Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//	To declare an array, define the variable type with square brackets:

	public static void main(String[] args) {
		
		int [] mymarks; // declaration
		mymarks=new int [5]; //memory allocation
		
		int [] yourMarks = new int [5]; //declaration + memory allocation
		
		int [] otherMarks = {1,2,3}; //declare+initialize
		System.out.println(otherMarks[0]);
		
	
		//======================================================================================================
		
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		
		System.out.println(cars[0]);
		cars[0] = "Opel";
		System.out.println(cars.length);
		
		for (int i = cars.length-1; i >=0; i--) {
			  System.out.println(cars[i] +" Reverese order");
			}
		
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
		
		for (String i : cars) {
			  System.out.println(i);
			}

		
		
		//======================================================================================================
		
		// An array storing different ages
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

		float avg, sum = 0;

		// Get the length of the array
		int length = ages.length;

		// Loop through the elements of the array
		for (int age : ages) {
		  sum += age;
		}
		
		// Calculate the average by dividing the sum by the length
		avg = sum / ages.length;

		// Print the average
		System.out.println("The average age is: " + avg);
		
		//======================================================================================================
		
		// Multidimensional array
		
		
		
		
		
	}

}
