package com.theory;

public class IfElseCH8

{
//	Use if to specify a block of code to be executed, if a specified condition is true
//	Use else to specify a block of code to be executed, if the same condition is false
//	Use else if to specify a new condition to test, if the first condition is false
//	Use switch to specify many alternative blocks of code to be executed

	public static void main(String[] args)

	{
//		Use the if statement to specify a block of Java code to be executed if a condition is true.
//		Use the else statement to specify a block of code to be executed if the condition is false.

		int age = 12;
		int y = 18;
		if (age > y) {
			System.out.println("x is greater than y");
		}

		else {

			System.out.println("x is not greater than y");
		}

		// the else if statement to specify a new condition if the first condition is
		// false

		int time = 22;
		if (time < 10) {
			System.out.println("Good morning.");
		} else if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
//		There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
		//
//			It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
		
		int time2 = 17;
		String result = (time2 < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}
	

	
	

}
