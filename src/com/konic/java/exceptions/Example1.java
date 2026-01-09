package com.konic.java.exceptions;

public class Example1 {

	public static void main(String[] args) {
		
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Not Division by Zero");
		}
		

	}

}
