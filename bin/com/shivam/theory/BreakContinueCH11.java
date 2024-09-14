package com.theory;

public class BreakContinueCH11 {

	
	public static void main(String[] args) {
		
		
//		The break statement can also be used to jump out of a loop
//		This example stops the loop when i is equal to 4:
		
		System.out.println("break");
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
//		The continue statement breaks one iteration (in the loop), if a specified condition occurs, 
//		and continues with the next iteration in the loop.This example skips the value of 4:
		
		System.out.println("continue");
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		
	}
	
}
