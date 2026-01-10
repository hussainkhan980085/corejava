package com.konic.java.exceptions;

public class Example13 {

	public static void main(String[] args) {
		try {
			 int  a = 10/0;
		} catch (Exception e) {
			System.out.println("Catch");
		} finally {
			int b = 10/0;
		}

	}

}
