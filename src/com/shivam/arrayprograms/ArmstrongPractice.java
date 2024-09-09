package com.shivam.arrayprograms;

import java.util.Scanner;

public class ArmstrongPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int number = sc.nextInt();
		sc.close();

		int originalNum = number;
		int sum = 0;
		int length = countDigits(number);// we can also use countDigits method

		while (number != 0) {
			int digit = number % 10;
			sum += power(digit, length);
			//sum += Math.pow(digit, digits); // We can also use power method manually
			number /= 10;

		}

		if (sum == originalNum)

		{

			System.out.println(originalNum + " is Armstrong");
		}

		else {

			System.out.println(originalNum + " is not Armstrong");
		}

	}

	// Method to calculate base^exponent manually
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base; // Multiply base exponent times
		}
		return result;
	}

	// Method to count the number of digits in a number
	public static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number /= 10;
		}
		return count;
	}

}


