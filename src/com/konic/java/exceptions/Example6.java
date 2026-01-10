package com.konic.java.exceptions;

public class Example6 {

	public static void main(String[] args) {
		try {
			int a = 10/0;
		} catch (Exception e) {
			System.out.println("parent");
		} catch (ArithmeticException e) {
			System.out.println("child");
		}

	}

}
