package com.konic.java.agevalidation.projects;


public class RegistrationService {

	 public void registerUser(String name,int age,String email)
	    throws InvalidAgeException, InvalidEmailException {
		 
		 if(age<18) {
			 throw new InvalidEmailException("Age must be 18 or above");
		 }
		 if (!email.contains("@")) {
		    throw new InvalidEmailException("Email must contains @ symbol");
     	 }
	     
	       System.out.println("User registered Successfully");
	       
	 }	    
}
