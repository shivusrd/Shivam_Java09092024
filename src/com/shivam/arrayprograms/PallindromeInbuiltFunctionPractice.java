package com.shivam.arrayprograms;

import java.util.Scanner;

public class PallindromeInbuiltFunctionPractice {

	public void getPallindromeData(String input)

	{
		// Remove spaces and convert to lower case for accurate comparison
				String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
				//a&^yu
				//ayu

				// Reverse the cleaned string
				String reversed = new StringBuilder(cleaned).reverse().toString();

				// Check if the original cleaned string is equal to the reversed string
				if (cleaned.equals(reversed)) {
					System.out.println("The string is a palindrome.");
				} else {
					System.out.println("The string is not a palindrome.");
				}

				

	}

	public static void main(String[] args) {
		PallindromeInbuiltFunctionPractice pb = new PallindromeInbuiltFunctionPractice();
		Scanner sc = new Scanner(System.in);
		// Input a string from the user
		System.out.print("Enter a string: ");
		String original = sc.nextLine();
		pb.getPallindromeData(original);

	}

}
