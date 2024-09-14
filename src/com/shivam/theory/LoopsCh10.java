package com.theory;

public class LoopsCh10 {

	public static void main(String[] args) {

		System.out.println("while loop");

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("do while loop");

//		The do/while loop is a variant of the while loop. This loop will execute the code block once, 
//		before checking if the condition is true, then it will repeat the loop as long as the condition is true.

		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 5);

//		When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

		System.out.println("for loop");

		for (int k = 0; k < 5; k++) {
			System.out.println(k);
		}

		System.out.println("for loop another example");
		for (int l = 0; l <= 10; l = l + 2) {
			System.out.println(l);
		}

//		It is also possible to place a loop inside another loop. This is called a nested loop.
//
//		The "inner loop" will be executed one time for each iteration of the "outer loop":
		// Outer loop

		System.out.println("nested loop");
		for (int m = 1; m <= 2; m++) {
			System.out.println("Outer: " + m); // Executes 2 times

			// Inner loop
			for (int n = 1; n <= 3; n++) {
				System.out.println(" Inner: " + n); // Executes 6 times (2 * 3)
			}
		}
		
//		There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String o : cars) {
		  System.out.println(o);
		}

	}

}
