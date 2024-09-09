package com.shivam.arrayprograms;

import java.util.Scanner;

public class ArmstrongPractice 
{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int digits = String.valueOf(number).length(); // Number of digits in the number

	        while (number != 0) {
	            int digit = number % 10; // Extract the last digit
	            sum += Math.pow(digit, digits); // Add the digit raised to the power of the number of digits
	            number /= 10; // Remove the last digit
	        }

	        return sum == originalNumber;
	    }
	}


