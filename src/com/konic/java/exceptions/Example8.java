package com.konic.java.exceptions;


public class Example8 {

	public static void main(String[] args) {
		
		///  NestedClassWriter try catch
		
		
		try {
			try {
				int a = 10/0;
			}catch(ArithmeticException e) {
				System.out.println("Inner catch");
			}
		} catch (Exception e) {
			System.out.println("Outer Catch");
			
	}

}
}