package com.theory;

public class StringCH7 {

	
	
//	Strings are used for storing text.
//	A String variable contains a collection of characters surrounded by double quotes:
//		
//		A String in Java is actually an object, which contain methods that can perform certain operations on strings.
//		For example, the length of a string can be found with the length() method:
	
	
	public static void main(String[] args) {

		
		String txt = new String ("Shivam , is \" a good boy");
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println(txt.replace('a', 'Z'));
		System.out.println(txt.endsWith("XYZ"));
		System.out.println(txt.replace(" ", "_"));
		
		
		String x = "10";
		int y = 20;
		String z = x + y;  // z will be 1020 (a String)
		System.out.println(z);
	}

}
