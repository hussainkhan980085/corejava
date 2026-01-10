package com.konic.java.exceptions;

public class Example7 {

	public static void main(String[] args) {
	 try {
		 int a = 10/0;	 
	 } catch (ArithmeticException | NullPointerException e) {
		 System.out.println("Handled");
	 }


	}

}
 