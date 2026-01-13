package com.konic.java.throwcatch.exception;

public class MaintainMinimumBalance {
	
	public static void main(String[] args) {
		
		
		
		int balance = 1100;

		if (balance < 1000) {
		    throw new RuntimeException("Minimum balance not maintained");
		}
		


		

	}

}
