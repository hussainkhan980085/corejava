  package com.konic.java.exceptions;


public class Example14 {

	public static void main(String[] args) {
		
		try { 
			Thread.sleep(1000); 
			} catch (InterruptedException e) { 
			e.printStackTrace(); 
			} 
	}
	
}
