package com.konic.java.exceptions;

public class Example12 {
	 public static void main(String[] args) {
		
		 try {
			   int a = 10/0;
		 } catch (ArithmeticException e) {
			 int b = 10/0;
		 } finally {
			System.out.println("Finally");
		}
		 
	}

}
