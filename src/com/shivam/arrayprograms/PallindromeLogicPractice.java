package com.shivam.arrayprograms;

import java.util.Scanner;

public class PallindromeLogicPractice

{
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Convert to lowercase manually
        String cleaned = "";
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            // Convert to lowercase manually and ignore non-alphanumeric characters
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);  // Convert to lowercase
            }
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                cleaned += c;  // Append only alphanumeric characters
            }
        }

        // Check if the cleaned string is a palindrome
        boolean isPalindrome = true;
        int length = cleaned.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

	}


