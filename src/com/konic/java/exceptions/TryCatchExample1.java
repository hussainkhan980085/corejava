package com.konic.java.exceptions;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		int x = 100;
	    int y = 0;
	    
	    try {
	    	int result = x / y;
	    	
	    	System.out.println(result);
	   	
	    } catch (ArithmeticException e) {
	    	
	    	System.out.println("Cannot Divided by zero");
	    	
	    }
		
	    System.out.println("Program Continue.....");

	}
}

