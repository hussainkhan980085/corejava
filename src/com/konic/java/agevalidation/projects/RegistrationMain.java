package com.konic.java.agevalidation.projects;

import java.util.Scanner;


public class RegistrationMain {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		  RegistrationService service = new RegistrationService();
		  try {
			  System.out.println("Enter Name:  ");
			    String name = sc.nextLine();
			    
			 System.out.println("Enter Age: ");
			   int age = sc.nextInt();
			    sc.nextLine();
			    
			 System.out.print("Enter Email: ");
	            String email = sc.nextLine(); 
	            
	            service.registerUser(name, age, email);
	            
		  }
		  catch(InvalidAgeException e) {
			  System.out.println("Enter Age: " + e.getMessage());
		  
		  }catch(InvalidEmailException e) {
			  System.out.println( "Enter Email: " + e.getMessage());
			  
		  }finally {
			  System.out.println("Registration process completed");
			
		}
			 
	}
}
