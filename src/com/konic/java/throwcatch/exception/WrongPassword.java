package com.konic.java.throwcatch.exception;

public class WrongPassword {

	public static void main(String[] args) {
		
		
		String password = "dmin123";

		if (!password.equals("admin123")) {
		    throw new RuntimeException("Invalid password");
		}
          System.out.println("Correct Password");
	}

}
