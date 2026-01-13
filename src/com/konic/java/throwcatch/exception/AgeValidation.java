package com.konic.java.throwcatch.exception;

public class AgeValidation {
	 
	// Method to validate age
	static void checkAge(int age) {
 
		// Business rule
		if (age < 18) {
			// Manually throwing custom exception
			throw new YoungerAgeException("Age is below 18, not allowed");
		}
 
		// Normal flow
		System.out.println("Age is valid, access granted");
	}
 
	public static void main(String[] args) {
 
		try {
			// Calling method
			checkAge(16);
 
		} catch (YoungerAgeException e) {
			// Handling custom exception
			System.out.println("Exception handled: " + e.getMessage());
		}
 
		// Program continues
		System.out.println("Program completed");
	}
}