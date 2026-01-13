package com.konic.java.throwcatch.exception;



public class AgeLimit {
	
	public static void main(String[] args) {
		
		int age =20;
		
		if (age < 18) {
			throw new ArithmeticException("Age is not valid");
			
		}
		System.out.println("you can vote");
	} 
	
}
