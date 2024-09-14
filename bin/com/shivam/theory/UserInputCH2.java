package com.theory;

import java.util.Scanner;

public class UserInputCH2 {

	public void getData(int number) 
	
	
	{
		while (number!=0)
			
		{
			
			System.out.println(number + " Removed last digit");
			int remainder = number%10;//remainder
			System.out.println(remainder + " Remainder");
			number/=10;//remove last digit
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=sc.nextInt();
		sc.close();
		UserInputCH2 ob = new UserInputCH2();
		ob.getData(number);
		
		
		
		
		
		
		
		
	}
}
