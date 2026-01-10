package com.konic.java.exceptions;

public class Example15 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("a.txt")) { 
			System.out.println("Reading file"); 
			} catch (Exception e) { 
			System.out.println("Error"); 
			} 

	}

}
