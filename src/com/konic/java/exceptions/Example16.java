package com.konic.java.exceptions;

public class Example16 {

	public static void main(String[] args) {
		try { 
			int a = 10 / 0; 
			} catch (ArithmeticException e) { 
			System.out.println("Division by zero"); 
			} 
	}

}
