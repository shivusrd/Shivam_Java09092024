package com.shivam.arrayprograms;

import java.util.Scanner;

public class FibonacciPractice {

	public void fibonacci(int number)

	{
		int num1 = 0, num2 = 1, num3;

		for (int i = 0; i <= number; i++)

		{

			System.out.println(num1 + "");

			num3 = num2 + num1;
			num1 = num2;
			num2 = num3;

		}

	}

	public static void main(String[] args)

	{

		FibonacciPractice fb = new FibonacciPractice();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number of iterations");
		int number = sc.nextInt();
		fb.fibonacci(number);

	}

}
