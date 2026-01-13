package com.konic.java.throwcatch.exception;



public class PasswordValidation {

	public static void main(String[] args) {
		
		
		/// Password= Khan@123
		String password = "Khan1234";
		
		if (password.length() <8) {
			
			throw new RuntimeException("Passwaord Is too short Please enter Correct Password");
		}
 		
		System.out.println("Password entered sucessfully");
		

	}

}
