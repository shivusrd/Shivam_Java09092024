package com.theory;

public class OperatorsCH3 {
	
	// Operators are used to perform operations on variables and their values
	// Arithematic Op - +,-,*,/,%,++,--
	// Assignment Op - =,<=,>=
	// logical Op - &&,||,!
	// Bitwise Op - & , |
	
	
	
	public static void main(String[] args) {
		
		int num,num2;
		num=1454;
		num2=20;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num>num2);
		System.out.println(num>=num2);
		System.out.println(num>num2||num2>num);
		System.out.println(num>num2&&num2>num);
		System.out.println(!(num>num2));
		System.out.println(num%num2 + " modulus");
		System.out.println(num/=10);
		num+=9;
		System.out.println(num);
		
		
	}

}
