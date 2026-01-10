package com.konic.java.exceptions;

public class Example5 {

	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Maths error");
		} catch (NullPointerException n) {
			System.out.println("Null Error");
		}

	}

}
