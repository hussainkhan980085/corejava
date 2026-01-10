package com.konic.java.exceptions;

public class Example4 {

	public static void main(String[] args) {
		
		try {
			int a = 10/0;
		} catch(ArithmeticException e) {
			System.out.println("Exception Caugth");
		} finally {
			System.out.println("Cleanup Done"); 
		}

	}

}
